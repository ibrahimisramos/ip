package errors;

public class Errors {
    public enum ErrorTypes{
    INPUT_ERROR,INVALID_TASK_NAME_ERROR,INVALID_TASK_DETAILS_ERROR, INVALID_TASK_MARK_ERROR
    }
    public static final String  INPUT_ERROR = " Please specify an appropriate command for me to execute";
    public static final String  INVALID_TASK_NAME_ERROR = " Hi I need a valid task name";
    public static final String  INVALID_TASK_DETAILS_ERROR = " Hi your task details is incomplete";
    public static final String  INVALID_TASK_MARK_ERROR = " Hi I need a valid task number";
}
