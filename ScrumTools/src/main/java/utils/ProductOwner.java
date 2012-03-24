package utils;

/**
 * TODO: description
 */
public class ProductOwner extends Rol {

    @Override
    public Boolean isEnabledToCreateUserStories() {
        return true;
    }

    @Override
    public Boolean isEnabledToPriorityUserStories() {
        return true;
    }

    @Override
    public Boolean isEnabledToChangeStateOfUserStories() {
        return true;
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
        return false;
    }

}
