package test;

import java.util.Date;
import java.util.Objects;

public class Clock {

	private Integer employee_id;
	private Date clock_in_datetime;
	private Date clock_out_datetime;

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public Date getClock_in_datetime() {
		return clock_in_datetime;
	}

	public void setClock_in_datetime(Date clock_in_datetime) {
		this.clock_in_datetime = clock_in_datetime;
	}

	public Date getclock_out_datetimee() {
		return clock_out_datetime;
	}

	public void setclock_out_datetimee(Date clock_out_datetime) {
		this.clock_out_datetime = clock_out_datetime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clock_in_datetime == null) ? 0 : clock_in_datetime.hashCode());
		result = prime * result + ((clock_out_datetime == null) ? 0 : clock_out_datetime.hashCode());
		result = prime * result + employee_id;
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
		Clock other = (Clock) obj;
		if (clock_in_datetime == null) {
			if (other.clock_in_datetime != null)
				return false;
		} else if (!clock_in_datetime.equals(other.clock_in_datetime))
			return false;
		if (clock_out_datetime == null) {
			if (other.clock_out_datetime != null)
				return false;
		} else if (!clock_out_datetime.equals(other.clock_out_datetime))
			return false;
		if (employee_id != other.employee_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Clock [employee_id=" + employee_id + ", clock_in_datetime=" + clock_in_datetime + ", clock_out_datetime="
				+ clock_out_datetime + "]";
	}

}
