package JavaStepByStep;

public class Name {
    String firstName;
    String lastName;

    public void setName(String first,String last){
        firstName = first;
        lastName = last;
    }

    public void setName(String s){
        int k = s.indexOf(',');
        if(k<0)
            throw new IllegalArgumentException("Wrong in the name");
        lastName = s.substring(0,k).trim();
        firstName = s.substring(k+1).trim();
    }
}
