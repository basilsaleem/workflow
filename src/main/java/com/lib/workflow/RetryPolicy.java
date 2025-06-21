package com.lib.workflow;

import java.util.Objects;

public class RetryPolicy {
    private int maxAttempts;
    private long backoffMillis; // milliseconds to wait between retries

    public long getBackoffMillis() {
        return backoffMillis;
    }

    public void setBackoffMillis(long backoffMillis) {
        this.backoffMillis = backoffMillis;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetryPolicy that = (RetryPolicy) o;
        return maxAttempts == that.maxAttempts && backoffMillis == that.backoffMillis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxAttempts, backoffMillis);
    }
}
