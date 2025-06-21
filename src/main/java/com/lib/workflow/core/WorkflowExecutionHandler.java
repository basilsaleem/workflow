package com.lib.workflow.core;

public interface WorkflowExecutionHandler {

    /**
     * Handles the workflow execution message.
     *
     * @param message the message to handle
     */
    void handle(String message);

    /**
     * Handles the workflow execution error message.
     *
     * @param errorMessage the error message to handle
     */
    void handleFailure(String errorMessage);
}
