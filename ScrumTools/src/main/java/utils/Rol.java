package utils;

/**
 * TODO: description
 */
public abstract class Rol {

    public abstract Boolean isEnabledToCreateUserStories();

    public abstract Boolean isEnabledToPriorityUserStories();

    public abstract Boolean isEnabledToChangeStateOfUserStories();

    public abstract Boolean isEnabledToCreateProyect();

    public abstract Boolean isEnabledToCreateTasks();

    public abstract Boolean isEnabledToManageSprint();

    public abstract Boolean isEnabledToManageRol();

    public abstract Boolean isEnabledToChangeStateOfTasks();

}
