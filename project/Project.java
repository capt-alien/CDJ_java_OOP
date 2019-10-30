
// ● Create a Project class that has the fields of name and description.
public class Project{
    public String name;
    public String description;

    public Project(){
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    // ● Create an instance method called elevatorPitch that will return the
    //   name and description separated by a colon.
    public static String elevatorPitch(){
        String pitch = String.format("%s : %s", this.name, this.description);
        return pitch;
    }
    // GETTERS
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    // SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
