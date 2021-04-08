import jdk.jfr.Description;

public class Project {
    private String name = "Suraj Singh";
    private String description = "Lucky";

    public String elevatorPitch(){
        String str = this.name + ":" + this.description;
        return str;
    }
}
