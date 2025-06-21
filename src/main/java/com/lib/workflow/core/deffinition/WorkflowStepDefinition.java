package com.lib.workflow.core.deffinition;

import com.lib.workflow.RetryPolicy;

import java.util.Objects;

public class WorkflowStepDefinition {
    private String name;
    private String type;
    private RetryPolicy retry;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RetryPolicy getRetry() {
        return retry;
    }

    public void setRetry(RetryPolicy retry) {
        this.retry = retry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkflowStepDefinition that = (WorkflowStepDefinition) o;
        return Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(retry, that.retry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, retry);
    }
}
