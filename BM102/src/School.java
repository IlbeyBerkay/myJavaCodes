import javax.management.remote.SubjectDelegationPermission;

public class School extends AllActivities{
    // default constructor
    public School(){

    }
    //Returns information about the school and library.
    public String goToSchool (){
        return super.goToSchool() + " But I didn't go this Friday. :)";
    }
    public String goToLibrary (){
        return  super.goToLibrary() + "But this week I only studied in the library on Friday and Sunday from 9 am to 6 pm.";
    }


}

