package com.lib.workflow.core.type;

public enum WorkflowType {
    DB_WORKFLOW("db_workflow"),
    DECLARATIVE_WORKFLOW("declarative_workflow");

    final String type;

    WorkflowType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
