package utils;

/**
 * TODO: description
 */
public class ScrumMaster extends Rol {

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
        return true;
    }

    @Override
    public Boolean isEnabledToCreateTasks() {
        return true;
    }

    @Override
    public Boolean isEnabledToManageSprint() {
        return true;
    }

    @Override
    public Boolean isEnabledToManageRol() {
        return true;
    }

    @Override
    public Boolean isEnabledToChangeStateOfTasks() {
        return false;
    }

}
