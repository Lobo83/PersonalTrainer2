package persitence.db.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UserDataHistoric generated by hbm2java.
 */
@Entity
@Table(name = "user_data_historic", catalog = "personalTrainer", uniqueConstraints = {})

public class UserDataHistoricJPA extends AuditableEntityJPA implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2840931328265947550L;

	/** The id user data historic. */
	@Id
	@Column(name = "ID_USER_DATA_HISTORIC", unique = true, nullable = false, insertable = true, updatable = true)

	private Integer idUserDataHistoric;

	/** The user data. */
	@ManyToOne
	private UserDataJPA userData;
	/** The sex. */
	@Column(name = "SEX", length = 10)
	private String sex;

	/** The weight. */
	@Column(name = "WEIGHT", precision = 7)
	private BigDecimal weight;

	/** The height. */
	@Column(name = "HEIGHT", precision = 7)
	private BigDecimal height;

	/** The belly. */
	@Column(name = "BELLY", precision = 7)
	private BigDecimal belly;

	/** The hip. */
	@Column(name = "HIP", precision = 7)
	private BigDecimal hip;

	/** The chest. */
	@Column(name = "CHEST", precision = 7)
	private BigDecimal chest;

	/** The mail. */
	@Column(name = "MAIL", length = 100)
	private String mail;

	/** The name. */
	@Column(name = "NAME", length = 100)
	private String name;

	/** The imc. */
	@Column(name = "IMC", precision = 7)
	private BigDecimal imc;

	/** The igc. */
	@Column(name = "IGC", precision = 7)
	private BigDecimal igc;

	/** The mcm. */
	@Column(name = "MCM", precision = 7)
	private BigDecimal mcm;

	/** The mb. */
	@Column(name = "MB", precision = 7)
	private BigDecimal mb;

	/** The base heart rate. */
	@Column(name = "BASE_HEART_RATE", precision = 7)
	private BigDecimal baseHeartRate;

	/** The belly height rate. */
	@Column(name = "BELLY_HEIGHT_RATE", precision = 7)
	private BigDecimal bellyHeightRate;

	/** The age. */
	@Column(name = "AGE", length = 3)
	private String age;

	/** The max heart rate. */
	@Column(name = "MAX_HEART_RATE", precision = 7)
	private BigDecimal maxHeartRate;

	/** The heart ratea. */
	@Column(name = "HEART_RATEA", length = 45)
	private String heartRatea;

	/** The heart rateb. */
	@Column(name = "HEART_RATEB", length = 45)
	private String heartRateb;

	/** The heart ratec. */
	@Column(name = "HEART_RATEC", length = 45)
	private String heartRatec;

	/** The heart rated. */
	@Column(name = "HEART_RATED", length = 45)
	private String heartRated;

	/** The heart ratee. */
	@Column(name = "HEART_RATEE", length = 45)
	private String heartRatee;

	/** The historic date. */
	@Column(name = "HISTORIC_DATE", length = 19)
	private LocalDate historicDate;

	/**
	 * Gets the id user data historic.
	 *
	 * @return the id user data historic
	 */
	public Integer getIdUserDataHistoric() {
		return idUserDataHistoric;
	}

	/**
	 * Sets the id user data historic.
	 *
	 * @param idUserDataHistoric
	 *            the new id user data historic
	 */
	public void setIdUserDataHistoric(final Integer idUserDataHistoric) {
		this.idUserDataHistoric = idUserDataHistoric;
	}

	/**
	 * Gets the user data.
	 *
	 * @return the user data
	 */
	public UserDataJPA getUserData() {
		return userData;
	}

	/**
	 * Sets the user data.
	 *
	 * @param userData
	 *            the new user data
	 */
	public void setUserData(final UserDataJPA userData) {
		this.userData = userData;
	}

	/**
	 * Gets the sex.
	 *
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Sets the sex.
	 *
	 * @param sex
	 *            the new sex
	 */
	public void setSex(final String sex) {
		this.sex = sex;
	}

	/**
	 * Gets the weight.
	 *
	 * @return the weight
	 */
	public BigDecimal getWeight() {
		return weight;
	}

	/**
	 * Sets the weight.
	 *
	 * @param weight
	 *            the new weight
	 */
	public void setWeight(final BigDecimal weight) {
		this.weight = weight;
	}

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public BigDecimal getHeight() {
		return height;
	}

	/**
	 * Sets the height.
	 *
	 * @param height
	 *            the new height
	 */
	public void setHeight(final BigDecimal height) {
		this.height = height;
	}

	/**
	 * Gets the belly.
	 *
	 * @return the belly
	 */
	public BigDecimal getBelly() {
		return belly;
	}

	/**
	 * Sets the belly.
	 *
	 * @param belly
	 *            the new belly
	 */
	public void setBelly(final BigDecimal belly) {
		this.belly = belly;
	}

	/**
	 * Gets the hip.
	 *
	 * @return the hip
	 */
	public BigDecimal getHip() {
		return hip;
	}

	/**
	 * Sets the hip.
	 *
	 * @param hip
	 *            the new hip
	 */
	public void setHip(final BigDecimal hip) {
		this.hip = hip;
	}

	/**
	 * Gets the chest.
	 *
	 * @return the chest
	 */
	public BigDecimal getChest() {
		return chest;
	}

	/**
	 * Sets the chest.
	 *
	 * @param chest
	 *            the new chest
	 */
	public void setChest(final BigDecimal chest) {
		this.chest = chest;
	}

	/**
	 * Gets the mail.
	 *
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Sets the mail.
	 *
	 * @param mail
	 *            the new mail
	 */
	public void setMail(final String mail) {
		this.mail = mail;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Gets the imc.
	 *
	 * @return the imc
	 */
	public BigDecimal getImc() {
		return imc;
	}

	/**
	 * Sets the imc.
	 *
	 * @param imc
	 *            the new imc
	 */
	public void setImc(final BigDecimal imc) {
		this.imc = imc;
	}

	/**
	 * Gets the igc.
	 *
	 * @return the igc
	 */
	public BigDecimal getIgc() {
		return igc;
	}

	/**
	 * Sets the igc.
	 *
	 * @param igc
	 *            the new igc
	 */
	public void setIgc(final BigDecimal igc) {
		this.igc = igc;
	}

	/**
	 * Gets the mcm.
	 *
	 * @return the mcm
	 */
	public BigDecimal getMcm() {
		return mcm;
	}

	/**
	 * Sets the mcm.
	 *
	 * @param mcm
	 *            the new mcm
	 */
	public void setMcm(final BigDecimal mcm) {
		this.mcm = mcm;
	}

	/**
	 * Gets the mb.
	 *
	 * @return the mb
	 */
	public BigDecimal getMb() {
		return mb;
	}

	/**
	 * Sets the mb.
	 *
	 * @param mb
	 *            the new mb
	 */
	public void setMb(final BigDecimal mb) {
		this.mb = mb;
	}

	/**
	 * Gets the base heart rate.
	 *
	 * @return the base heart rate
	 */
	public BigDecimal getBaseHeartRate() {
		return baseHeartRate;
	}

	/**
	 * Sets the base heart rate.
	 *
	 * @param baseHeartRate
	 *            the new base heart rate
	 */
	public void setBaseHeartRate(final BigDecimal baseHeartRate) {
		this.baseHeartRate = baseHeartRate;
	}

	/**
	 * Gets the belly height rate.
	 *
	 * @return the belly height rate
	 */
	public BigDecimal getBellyHeightRate() {
		return bellyHeightRate;
	}

	/**
	 * Sets the belly height rate.
	 *
	 * @param bellyHeightRate
	 *            the new belly height rate
	 */
	public void setBellyHeightRate(final BigDecimal bellyHeightRate) {
		this.bellyHeightRate = bellyHeightRate;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age
	 *            the new age
	 */
	public void setAge(final String age) {
		this.age = age;
	}

	/**
	 * Gets the max heart rate.
	 *
	 * @return the max heart rate
	 */
	public BigDecimal getMaxHeartRate() {
		return maxHeartRate;
	}

	/**
	 * Sets the max heart rate.
	 *
	 * @param maxHeartRate
	 *            the new max heart rate
	 */
	public void setMaxHeartRate(final BigDecimal maxHeartRate) {
		this.maxHeartRate = maxHeartRate;
	}

	/**
	 * Gets the heart ratea.
	 *
	 * @return the heart ratea
	 */
	public String getHeartRatea() {
		return heartRatea;
	}

	/**
	 * Sets the heart ratea.
	 *
	 * @param heartRatea
	 *            the new heart ratea
	 */
	public void setHeartRatea(final String heartRatea) {
		this.heartRatea = heartRatea;
	}

	/**
	 * Gets the heart rateb.
	 *
	 * @return the heart rateb
	 */
	public String getHeartRateb() {
		return heartRateb;
	}

	/**
	 * Sets the heart rateb.
	 *
	 * @param heartRateb
	 *            the new heart rateb
	 */
	public void setHeartRateb(final String heartRateb) {
		this.heartRateb = heartRateb;
	}

	/**
	 * Gets the heart ratec.
	 *
	 * @return the heart ratec
	 */
	public String getHeartRatec() {
		return heartRatec;
	}

	/**
	 * Sets the heart ratec.
	 *
	 * @param heartRatec
	 *            the new heart ratec
	 */
	public void setHeartRatec(final String heartRatec) {
		this.heartRatec = heartRatec;
	}

	/**
	 * Gets the heart rated.
	 *
	 * @return the heart rated
	 */
	public String getHeartRated() {
		return heartRated;
	}

	/**
	 * Sets the heart rated.
	 *
	 * @param heartRated
	 *            the new heart rated
	 */
	public void setHeartRated(final String heartRated) {
		this.heartRated = heartRated;
	}

	/**
	 * Gets the heart ratee.
	 *
	 * @return the heart ratee
	 */
	public String getHeartRatee() {
		return heartRatee;
	}

	/**
	 * Sets the heart ratee.
	 *
	 * @param heartRatee
	 *            the new heart ratee
	 */
	public void setHeartRatee(final String heartRatee) {
		this.heartRatee = heartRatee;
	}

	/**
	 * Gets the historic date.
	 *
	 * @return the historic date
	 */
	public LocalDate getHistoricDate() {
		return historicDate;
	}

	/**
	 * Sets the historic date.
	 *
	 * @param historicDate
	 *            the new historic date
	 */
	public void setHistoricDate(final LocalDate historicDate) {
		this.historicDate = historicDate;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {

		return Objects.hash(idUserDataHistoric);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (null == idUserDataHistoric || null == ((UserDataHistoricJPA) obj).getIdUserDataHistoric()) {
			return false;
		}
		return Objects.equals(idUserDataHistoric, ((UserDataHistoricJPA) obj).getIdUserDataHistoric());
	}

}