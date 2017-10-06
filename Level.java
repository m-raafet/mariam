
package schedulemaker;

public class Level {
    String name;
    String[] Courses;
    String[][] Doctors; //each Doctor[] has an array of courses
    
    public String GetLevel() {
        return name;
    }
    
    public void SetLevel(String name) {
        this.name = name;
    }
    
    public void SetCourses(String courses[]) {
        for(int i = 0; i < courses.length; i++) 
            this.Courses[i] = courses[i];
    }   
}
