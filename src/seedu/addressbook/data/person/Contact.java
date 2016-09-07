package seedu.addressbook.data.person;

import java.util.Objects;

import seedu.addressbook.data.tag.UniqueTagList;

public class Contact {
	
	public final String value;
    private boolean isPrivate;


    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Phone // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
