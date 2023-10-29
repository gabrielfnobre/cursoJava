package chalenges.usingEqualsWithHashCode;

public class MyObject {
    String name;
    String email;

    MyObject(String name, String email){
        this.name = name;
        this.email = email;
    }

    public boolean equals(MyObject obj) {
        if(obj instanceof MyObject){
            boolean comparisionName = this.name.equals(obj.name);
            boolean comparisionEmail = this.email.equals(obj.email);
            return comparisionName && comparisionEmail;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }
}
