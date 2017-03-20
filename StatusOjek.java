<<<<<<< HEAD

/**
 * Enumeration class StatusOjek - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusOjek
{
    Idle("Idle"), Jemput("Menjemput"), Antar("Mengantar");
    private String status;
    
    StatusOjek(String status){
        this.status = status;
    }
    
    public String status(){
        return status;
    }
    
=======

/**
 * Enumeration class StatusOjek - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StatusOjek
{
    Idle("Idle"), Jemput("Menjemput"), Antar("Mengantar");
    private String status;
    
    StatusOjek(String status){
        this.status = status;
    }
    
    public String status(){
        return status;
    }
>>>>>>> origin/master
}