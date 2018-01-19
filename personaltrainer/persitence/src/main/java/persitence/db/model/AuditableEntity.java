package persitence.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AuditableEntity {
	/** The create date. */
	private Date createDate;

	/** The update date. */
	private Date updateDate;

	/** The update user. */
	private String updateUser;

	/** The update program. */
	private String updateProgram;

	/** The optimist lock. */
	private int optimistLock;

	/**
	 * Gets the creates the date.
	 *
	 * @return the creates the date
	 */
	@Column(name = "CREATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 19)

	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * Sets the creates the date.
	 *
	 * @param createDate
	 *            the new creates the date
	 */
	public void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * Gets the update date.
	 *
	 * @return the update date
	 */
	@Column(name = "UPDATE_DATE", unique = false, nullable = false, insertable = true, updatable = true, length = 19)

	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * Sets the update date.
	 *
	 * @param updateDate
	 *            the new update date
	 */
	public void setUpdateDate(final Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * Gets the update user.
	 *
	 * @return the update user
	 */
	@Column(name = "UPDATE_USER", unique = false, nullable = false, insertable = true, updatable = true, length = 10)

	public String getUpdateUser() {
		return updateUser;
	}

	/**
	 * Sets the update user.
	 *
	 * @param updateUser
	 *            the new update user
	 */
	public void setUpdateUser(final String updateUser) {
		this.updateUser = updateUser;
	}

	/**
	 * Gets the update program.
	 *
	 * @return the update program
	 */
	@Column(name = "UPDATE_PROGRAM", unique = false, nullable = false, insertable = true, updatable = true, length = 45)

	public String getUpdateProgram() {
		return updateProgram;
	}

	/**
	 * Sets the update program.
	 *
	 * @param updateProgram
	 *            the new update program
	 */
	public void setUpdateProgram(final String updateProgram) {
		this.updateProgram = updateProgram;
	}

	/**
	 * Gets the optimist lock.
	 *
	 * @return the optimist lock
	 */
	@Column(name = "OPTIMIST_LOCK", unique = false, nullable = false, insertable = true, updatable = true)

	public int getOptimistLock() {
		return optimistLock;
	}

	/**
	 * Sets the optimist lock.
	 *
	 * @param optimistLock
	 *            the new optimist lock
	 */
	public void setOptimistLock(final int optimistLock) {
		this.optimistLock = optimistLock;
	}
}
