/*
 * Beacon Südtirol API
 * An API to manage beacons of the Beacon Südtirol project.
 *
 * OpenAPI spec version: 1.0-beta
 * Contact: web@raiffeisen.net
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Beacon;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * BeaconIssue
 */

public class BeaconIssue {
  @SerializedName("beacon")
  private Beacon beacon = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("problem")
  private String problem = null;

  @SerializedName("problemDescription")
  private String problemDescription = null;

  @SerializedName("reportDate")
  private OffsetDateTime reportDate = null;

  @SerializedName("reporter")
  private String reporter = null;

  @SerializedName("resolveDate")
  private OffsetDateTime resolveDate = null;

  @SerializedName("resolved")
  private Boolean resolved = null;

  @SerializedName("solution")
  private String solution = null;

  @SerializedName("solutionDescription")
  private String solutionDescription = null;

  public BeaconIssue beacon(Beacon beacon) {
    this.beacon = beacon;
    return this;
  }

   /**
   * Get beacon
   * @return beacon
  **/
  @ApiModelProperty(value = "")
  public Beacon getBeacon() {
    return beacon;
  }

  public void setBeacon(Beacon beacon) {
    this.beacon = beacon;
  }

  public BeaconIssue id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BeaconIssue problem(String problem) {
    this.problem = problem;
    return this;
  }

   /**
   * Get problem
   * @return problem
  **/
  @ApiModelProperty(value = "")
  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }

  public BeaconIssue problemDescription(String problemDescription) {
    this.problemDescription = problemDescription;
    return this;
  }

   /**
   * Get problemDescription
   * @return problemDescription
  **/
  @ApiModelProperty(value = "")
  public String getProblemDescription() {
    return problemDescription;
  }

  public void setProblemDescription(String problemDescription) {
    this.problemDescription = problemDescription;
  }

  public BeaconIssue reportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
    return this;
  }

   /**
   * Get reportDate
   * @return reportDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getReportDate() {
    return reportDate;
  }

  public void setReportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
  }

  public BeaconIssue reporter(String reporter) {
    this.reporter = reporter;
    return this;
  }

   /**
   * Get reporter
   * @return reporter
  **/
  @ApiModelProperty(value = "")
  public String getReporter() {
    return reporter;
  }

  public void setReporter(String reporter) {
    this.reporter = reporter;
  }

  public BeaconIssue resolveDate(OffsetDateTime resolveDate) {
    this.resolveDate = resolveDate;
    return this;
  }

   /**
   * Get resolveDate
   * @return resolveDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getResolveDate() {
    return resolveDate;
  }

  public void setResolveDate(OffsetDateTime resolveDate) {
    this.resolveDate = resolveDate;
  }

  public BeaconIssue resolved(Boolean resolved) {
    this.resolved = resolved;
    return this;
  }

   /**
   * Get resolved
   * @return resolved
  **/
  @ApiModelProperty(value = "")
  public Boolean isResolved() {
    return resolved;
  }

  public void setResolved(Boolean resolved) {
    this.resolved = resolved;
  }

  public BeaconIssue solution(String solution) {
    this.solution = solution;
    return this;
  }

   /**
   * Get solution
   * @return solution
  **/
  @ApiModelProperty(value = "")
  public String getSolution() {
    return solution;
  }

  public void setSolution(String solution) {
    this.solution = solution;
  }

  public BeaconIssue solutionDescription(String solutionDescription) {
    this.solutionDescription = solutionDescription;
    return this;
  }

   /**
   * Get solutionDescription
   * @return solutionDescription
  **/
  @ApiModelProperty(value = "")
  public String getSolutionDescription() {
    return solutionDescription;
  }

  public void setSolutionDescription(String solutionDescription) {
    this.solutionDescription = solutionDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconIssue beaconIssue = (BeaconIssue) o;
    return Objects.equals(this.beacon, beaconIssue.beacon) &&
        Objects.equals(this.id, beaconIssue.id) &&
        Objects.equals(this.problem, beaconIssue.problem) &&
        Objects.equals(this.problemDescription, beaconIssue.problemDescription) &&
        Objects.equals(this.reportDate, beaconIssue.reportDate) &&
        Objects.equals(this.reporter, beaconIssue.reporter) &&
        Objects.equals(this.resolveDate, beaconIssue.resolveDate) &&
        Objects.equals(this.resolved, beaconIssue.resolved) &&
        Objects.equals(this.solution, beaconIssue.solution) &&
        Objects.equals(this.solutionDescription, beaconIssue.solutionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beacon, id, problem, problemDescription, reportDate, reporter, resolveDate, resolved, solution, solutionDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconIssue {\n");
    
    sb.append("    beacon: ").append(toIndentedString(beacon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    problem: ").append(toIndentedString(problem)).append("\n");
    sb.append("    problemDescription: ").append(toIndentedString(problemDescription)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    resolveDate: ").append(toIndentedString(resolveDate)).append("\n");
    sb.append("    resolved: ").append(toIndentedString(resolved)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    solutionDescription: ").append(toIndentedString(solutionDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

