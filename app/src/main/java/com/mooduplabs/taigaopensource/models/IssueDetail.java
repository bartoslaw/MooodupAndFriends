package com.mooduplabs.taigaopensource.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class IssueDetail {

    @SerializedName("assigned_to")
    @Expose
    private Integer assignedTo;
    @SerializedName("blocked_note")
    @Expose
    private String blockedNote;
    @SerializedName("blocked_note_html")
    @Expose
    private String blockedNoteHtml;
    @SerializedName("comment")
    @Expose
    private String comment;
    @SerializedName("created_date")
    @Expose
    private String createdDate;
    @SerializedName("finish_date")
    @Expose
    private String finishDate;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_blocked")
    @Expose
    private Boolean isBlocked;
    @SerializedName("is_closed")
    @Expose
    private Boolean isClosed;
    @SerializedName("milestone")
    @Expose
    private Integer milestone;
    @SerializedName("modified_date")
    @Expose
    private String modifiedDate;
    @SerializedName("finished_date")
    @Expose
    private Object finishedDate;
    @SerializedName("owner")
    @Expose
    private Integer owner;
    @SerializedName("project")
    @Expose
    private Integer project;
    @SerializedName("ref")
    @Expose
    private Integer ref;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("severity")
    @Expose
    private Integer severity;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("watchers")
    @Expose
    private List<Object> watchers = new ArrayList<Object>();
    @SerializedName("generated_user_stories")
    @Expose
    private List<Object> generatedUserStories = new ArrayList<Object>();
    @SerializedName("votes")
    @Expose
    private Object votes;
    @SerializedName("status_extra_info")
    @Expose
    private StatusExtraInfo statusExtraInfo;
    @SerializedName("assigned_to_extra_info")
    @Expose
    private AssignedToExtraInfo assignedToExtraInfo;

    /**
     * @return The assignedTo
     */
    public Integer getAssignedTo() {
        return assignedTo;
    }

    /**
     * @param assignedTo The assigned_to
     */
    public void setAssignedTo(Integer assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
     * @return The blockedNote
     */
    public String getBlockedNote() {
        return blockedNote;
    }

    /**
     * @param blockedNote The blocked_note
     */
    public void setBlockedNote(String blockedNote) {
        this.blockedNote = blockedNote;
    }

    /**
     * @return The blockedNoteHtml
     */
    public String getBlockedNoteHtml() {
        return blockedNoteHtml;
    }

    /**
     * @param blockedNoteHtml The blocked_note_html
     */
    public void setBlockedNoteHtml(String blockedNoteHtml) {
        this.blockedNoteHtml = blockedNoteHtml;
    }

    /**
     * @return The comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment The comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return The createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate The created_date
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return The finishDate
     */
    public String getFinishDate() {
        return finishDate;
    }

    /**
     * @param finishDate The finish_date
     */
    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The isBlocked
     */
    public Boolean getIsBlocked() {
        return isBlocked;
    }

    /**
     * @param isBlocked The is_blocked
     */
    public void setIsBlocked(Boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    /**
     * @return The isClosed
     */
    public Boolean getIsClosed() {
        return isClosed;
    }

    /**
     * @param isClosed The is_closed
     */
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    /**
     * @return The milestone
     */
    public Integer getMilestone() {
        return milestone;
    }

    /**
     * @param milestone The milestone
     */
    public void setMilestone(Integer milestone) {
        this.milestone = milestone;
    }

    /**
     * @return The modifiedDate
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * @param modifiedDate The modified_date
     */
    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * @return The finishedDate
     */
    public Object getFinishedDate() {
        return finishedDate;
    }

    /**
     * @param finishedDate The finished_date
     */
    public void setFinishedDate(Object finishedDate) {
        this.finishedDate = finishedDate;
    }

    /**
     * @return The owner
     */
    public Integer getOwner() {
        return owner;
    }

    /**
     * @param owner The owner
     */
    public void setOwner(Integer owner) {
        this.owner = owner;
    }

    /**
     * @return The project
     */
    public Integer getProject() {
        return project;
    }

    /**
     * @param project The project
     */
    public void setProject(Integer project) {
        this.project = project;
    }

    /**
     * @return The ref
     */
    public Integer getRef() {
        return ref;
    }

    /**
     * @param ref The ref
     */
    public void setRef(Integer ref) {
        this.ref = ref;
    }

    /**
     * @return The status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return The severity
     */
    public Integer getSeverity() {
        return severity;
    }

    /**
     * @param severity The severity
     */
    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    /**
     * @return The priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * @param priority The priority
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * @return The type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return The subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject The subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * @return The version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version The version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return The watchers
     */
    public List<Object> getWatchers() {
        return watchers;
    }

    /**
     * @param watchers The watchers
     */
    public void setWatchers(List<Object> watchers) {
        this.watchers = watchers;
    }

    /**
     * @return The generatedUserStories
     */
    public List<Object> getGeneratedUserStories() {
        return generatedUserStories;
    }

    /**
     * @param generatedUserStories The generated_user_stories
     */
    public void setGeneratedUserStories(List<Object> generatedUserStories) {
        this.generatedUserStories = generatedUserStories;
    }

    /**
     * @return The votes
     */
    public Object getVotes() {
        return votes;
    }

    /**
     * @param votes The votes
     */
    public void setVotes(Object votes) {
        this.votes = votes;
    }

    /**
     * @return The statusExtraInfo
     */
    public StatusExtraInfo getStatusExtraInfo() {
        return statusExtraInfo;
    }

    /**
     * @param statusExtraInfo The status_extra_info
     */
    public void setStatusExtraInfo(StatusExtraInfo statusExtraInfo) {
        this.statusExtraInfo = statusExtraInfo;
    }

    /**
     * @return The assignedToExtraInfo
     */
    public AssignedToExtraInfo getAssignedToExtraInfo() {
        return assignedToExtraInfo;
    }

    /**
     * @param assignedToExtraInfo The assigned_to_extra_info
     */
    public void setAssignedToExtraInfo(AssignedToExtraInfo assignedToExtraInfo) {
        this.assignedToExtraInfo = assignedToExtraInfo;
    }


    @Generated("org.jsonschema2pojo")
    public class AssignedToExtraInfo {

        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("full_name_display")
        @Expose
        private String fullNameDisplay;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("big_photo")
        @Expose
        private String bigPhoto;

        /**
         * @return The username
         */
        public String getUsername() {
            return username;
        }

        /**
         * @param username The username
         */
        public void setUsername(String username) {
            this.username = username;
        }

        /**
         * @return The fullNameDisplay
         */
        public String getFullNameDisplay() {
            return fullNameDisplay;
        }

        /**
         * @param fullNameDisplay The full_name_display
         */
        public void setFullNameDisplay(String fullNameDisplay) {
            this.fullNameDisplay = fullNameDisplay;
        }

        /**
         * @return The photo
         */
        public String getPhoto() {
            return photo;
        }

        /**
         * @param photo The photo
         */
        public void setPhoto(String photo) {
            this.photo = photo;
        }

        /**
         * @return The bigPhoto
         */
        public String getBigPhoto() {
            return bigPhoto;
        }

        /**
         * @param bigPhoto The big_photo
         */
        public void setBigPhoto(String bigPhoto) {
            this.bigPhoto = bigPhoto;
        }

    }

    @Generated("org.jsonschema2pojo")
    public class StatusExtraInfo {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("color")
        @Expose
        private String color;

        /**
         * @return The name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name The name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return The color
         */
        public String getColor() {
            return color;
        }

        /**
         * @param color The color
         */
        public void setColor(String color) {
            this.color = color;
        }

    }
}