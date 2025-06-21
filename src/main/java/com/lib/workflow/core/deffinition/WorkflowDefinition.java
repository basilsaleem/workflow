package com.lib.workflow.core.deffinition;

import com.lib.workflow.core.type.WorkflowType;

import java.util.List;
import java.util.Objects;

public class WorkflowDefinition {
    private String id;
    private String name;
    private WorkflowType workflowType;
    private List<WorkflowStepDefinition> steps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WorkflowStepDefinition> getSteps() {
        return steps;
    }

    public void setSteps(List<WorkflowStepDefinition> steps) {
        this.steps = steps;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkflowDefinition that = (WorkflowDefinition) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(steps, that.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, steps);
    }
}
