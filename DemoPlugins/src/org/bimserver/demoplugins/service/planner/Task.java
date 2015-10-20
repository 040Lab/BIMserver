package org.bimserver.demoplugins.service.planner;

public class Task implements Comparable<Task> {
	private String code;
	private String description;
	private String uniqueKey;

	public Task(String uniqueKey, String code, String description) {
		this.uniqueKey = uniqueKey;
		this.code = code;
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uniqueKey == null) ? 0 : uniqueKey.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (uniqueKey == null) {
			if (other.uniqueKey != null)
				return false;
		} else if (!uniqueKey.equals(other.uniqueKey))
			return false;
		return true;
	}

	@Override
	public int compareTo(Task o) {
		return uniqueKey.compareTo(o.uniqueKey);
	}
	
	@Override
	public String toString() {
		return code;
	}

	public String getCode() {
		return code;
	}
	
	public String getDescription() {
		return description;
	}
}