package com.mooduplabs.taigaopensource.viewmodels;

import java.util.ArrayList;

/**
 * Created by Michal on 2015-11-21.
 */
public class IssueDetailsViewModel {
    private String assignedTo;
    private String blockedNote;
    private String comment;
    private String createdDate;
    private String description;
    private String finishDate;
    private String isBlocked;
    private String isClosed;
    private String milestone;
    private String modifiedDate;
    private String finishedDate;
    private boolean isVoted;
    private boolean isWatched;
    private String owner;
    private String project;
    private String userStory;
    private String ref;
    private String status;
    private String severity;
    private String priority;
    private String type;
    private String subject;
    private ArrayList<String> tags;
    private String version;
    private String voters;
    private String isIocaine;
    private ArrayList<String> watchers;

    public String getBlockedNote() {
        return blockedNote;
    }

    public void setBlockedNote(String blockedNote) {
        this.blockedNote = blockedNote;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishedDate) {
        this.finishDate = finishedDate;
    }

    public boolean getIsVoted() {
        return isVoted;
    }

    public void setIsVoted(boolean isVoted) {
        this.isVoted = isVoted;
    }

    public boolean getIsWathched() {
        return isWatched;
    }

    public void setIsWatched(boolean isWatched) {
        this.isWatched = isWatched;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVoters() {
        return voters;
    }

    public void setVoters(String voters) {
        this.voters = voters;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(String isBlocked) {
        this.isBlocked = isBlocked;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public String getMilestone() {
        return milestone;
    }

    public void setMilestone(String milestone) {
        this.milestone = milestone;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(String finishedDate) {
        this.finishedDate = finishedDate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getUserStory() {
        return userStory;
    }

    public void setUserStory(String userStory) {
        this.userStory = userStory;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIsIocaine() {
        return isIocaine;
    }

    public void setIsIocaine(String isIocaine) {
        this.isIocaine = isIocaine;
    }

    public ArrayList<String> getWatchers() {
        return watchers;
    }

    public void setWatchers(ArrayList<String> watchers) {
        this.watchers = watchers;
    }
}
