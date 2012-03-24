package utils;

/**
 * TODO: description
 */
public class TeamDeveloper extends Rol {

    @Override
    public Boolean isEnabledToCreateUserStories() {
        return false;
    }

    @Override
    public Boolean isEnabledToPriorityUserStories() {
        return false;
    }

    @Override
    public Boolean isEnabledToChangeStateOfUserStories() {
        return false;
    }

    @Override
    public Boolean isEnabledToCreateProyect() {
        return false;
    }

    @Override
    public Boolean isEnabledToCreateTasks() {
        return false;
    }

    @Override
    public Boolean isEnabledToManageSprint() {
        return false;
    }

    @Override
    public Boolean isEnabledToManageRol() {
        return false;
    }

    @Override
    public Boolean isEnabledToChangeStateOfTasks() {
        return true;
    }

}
