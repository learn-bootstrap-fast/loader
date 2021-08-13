package com.amberance;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;

import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */

class Instaloader {
	@JsonProperty("node_type")
	public String getNode_type() {
		return this.node_type;
	}

	public void setNode_type(String node_type) {
		this.node_type = node_type;
	}

	String node_type;

	@JsonProperty("version")
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	String version;
}

class Dimensions {
	@JsonProperty("height")
	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	int height;

	@JsonProperty("width")
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	int width;
}

class DisplayResource {
	@JsonProperty("config_height")
	public int getConfig_height() {
		return this.config_height;
	}

	public void setConfig_height(int config_height) {
		this.config_height = config_height;
	}

	int config_height;

	@JsonProperty("config_width")
	public int getConfig_width() {
		return this.config_width;
	}

	public void setConfig_width(int config_width) {
		this.config_width = config_width;
	}

	int config_width;

	@JsonProperty("src")
	public String getSrc() {
		return this.src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	String src;
}

class EdgeLikedBy {
	@JsonProperty("count")
	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	int count;
}

class Node {
	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;

	@JsonProperty("is_verified")
	public boolean getIs_verified() {
		return this.is_verified;
	}

	public void setIs_verified(boolean is_verified) {
		this.is_verified = is_verified;
	}

	boolean is_verified;

	@JsonProperty("profile_pic_url")
	public String getProfile_pic_url() {
		return this.profile_pic_url;
	}

	public void setProfile_pic_url(String profile_pic_url) {
		this.profile_pic_url = profile_pic_url;
	}

	String profile_pic_url;

	@JsonProperty("username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	String username;

	@JsonProperty("text")
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	String text;

	@JsonProperty("__typename")
	public String get__typename() {
		return this.__typename;
	}

	public void set__typename(String __typename) {
		this.__typename = __typename;
	}

	String __typename;

	@JsonProperty("accessibility_caption")
	public String getAccessibility_caption() {
		return this.accessibility_caption;
	}

	public void setAccessibility_caption(String accessibility_caption) {
		this.accessibility_caption = accessibility_caption;
	}

	String accessibility_caption;

	@JsonProperty("dimensions")
	public Dimensions getDimensions() {
		return this.dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	Dimensions dimensions;

	@JsonProperty("display_resources")
	public List<DisplayResource> getDisplay_resources() {
		return this.display_resources;
	}

	public void setDisplay_resources(List<DisplayResource> display_resources) {
		this.display_resources = display_resources;
	}

	List<DisplayResource> display_resources;

	@JsonProperty("display_url")
	public String getDisplay_url() {
		return this.display_url;
	}

	public void setDisplay_url(String display_url) {
		this.display_url = display_url;
	}

	String display_url;

	@JsonProperty("edge_media_to_tagged_user")
	public EdgeMediaToTaggedUser getEdge_media_to_tagged_user() {
		return this.edge_media_to_tagged_user;
	}

	public void setEdge_media_to_tagged_user(EdgeMediaToTaggedUser edge_media_to_tagged_user) {
		this.edge_media_to_tagged_user = edge_media_to_tagged_user;
	}

	EdgeMediaToTaggedUser edge_media_to_tagged_user;

	@JsonProperty("fact_check_information")
	public Object getFact_check_information() {
		return this.fact_check_information;
	}

	public void setFact_check_information(Object fact_check_information) {
		this.fact_check_information = fact_check_information;
	}

	Object fact_check_information;

	@JsonProperty("fact_check_overall_rating")
	public Object getFact_check_overall_rating() {
		return this.fact_check_overall_rating;
	}

	public void setFact_check_overall_rating(Object fact_check_overall_rating) {
		this.fact_check_overall_rating = fact_check_overall_rating;
	}

	Object fact_check_overall_rating;

	@JsonProperty("gating_info")
	public Object getGating_info() {
		return this.gating_info;
	}

	public void setGating_info(Object gating_info) {
		this.gating_info = gating_info;
	}

	Object gating_info;

	@JsonProperty("is_video")
	public boolean getIs_video() {
		return this.is_video;
	}

	public void setIs_video(boolean is_video) {
		this.is_video = is_video;
	}

	boolean is_video;

	@JsonProperty("media_preview")
	public String getMedia_preview() {
		return this.media_preview;
	}

	public void setMedia_preview(String media_preview) {
		this.media_preview = media_preview;
	}

	String media_preview;

	@JsonProperty("shortcode")
	public String getShortcode() {
		return this.shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	String shortcode;

	@JsonProperty("tracking_token")
	public String getTracking_token() {
		return this.tracking_token;
	}

	public void setTracking_token(String tracking_token) {
		this.tracking_token = tracking_token;
	}

	String tracking_token;

	@JsonProperty("caption_is_edited")
	public boolean getCaption_is_edited() {
		return this.caption_is_edited;
	}

	public void setCaption_is_edited(boolean caption_is_edited) {
		this.caption_is_edited = caption_is_edited;
	}

	boolean caption_is_edited;

	@JsonProperty("commenting_disabled_for_viewer")
	public boolean getCommenting_disabled_for_viewer() {
		return this.commenting_disabled_for_viewer;
	}

	public void setCommenting_disabled_for_viewer(boolean commenting_disabled_for_viewer) {
		this.commenting_disabled_for_viewer = commenting_disabled_for_viewer;
	}

	boolean commenting_disabled_for_viewer;

	@JsonProperty("comments_disabled")
	public boolean getComments_disabled() {
		return this.comments_disabled;
	}

	public void setComments_disabled(boolean comments_disabled) {
		this.comments_disabled = comments_disabled;
	}

	boolean comments_disabled;

	@JsonProperty("edge_liked_by")
	public EdgeLikedBy getEdge_liked_by() {
		return this.edge_liked_by;
	}

	public void setEdge_liked_by(EdgeLikedBy edge_liked_by) {
		this.edge_liked_by = edge_liked_by;
	}

	EdgeLikedBy edge_liked_by;

	@JsonProperty("edge_media_preview_like")
	public EdgeMediaPreviewLike getEdge_media_preview_like() {
		return this.edge_media_preview_like;
	}

	public void setEdge_media_preview_like(EdgeMediaPreviewLike edge_media_preview_like) {
		this.edge_media_preview_like = edge_media_preview_like;
	}

	EdgeMediaPreviewLike edge_media_preview_like;

	@JsonProperty("edge_media_to_caption")
	public EdgeMediaToCaption getEdge_media_to_caption() {
		return this.edge_media_to_caption;
	}

	public void setEdge_media_to_caption(EdgeMediaToCaption edge_media_to_caption) {
		this.edge_media_to_caption = edge_media_to_caption;
	}

	EdgeMediaToCaption edge_media_to_caption;

	@JsonProperty("edge_media_to_comment")
	public EdgeMediaToComment getEdge_media_to_comment() {
		return this.edge_media_to_comment;
	}

	public void setEdge_media_to_comment(EdgeMediaToComment edge_media_to_comment) {
		this.edge_media_to_comment = edge_media_to_comment;
	}

	EdgeMediaToComment edge_media_to_comment;

	@JsonProperty("edge_media_to_sponsor_user")
	public EdgeMediaToSponsorUser getEdge_media_to_sponsor_user() {
		return this.edge_media_to_sponsor_user;
	}

	public void setEdge_media_to_sponsor_user(EdgeMediaToSponsorUser edge_media_to_sponsor_user) {
		this.edge_media_to_sponsor_user = edge_media_to_sponsor_user;
	}

	EdgeMediaToSponsorUser edge_media_to_sponsor_user;

	@JsonProperty("edge_sidecar_to_children")
	public EdgeSidecarToChildren getEdge_sidecar_to_children() {
		return this.edge_sidecar_to_children;
	}

	public void setEdge_sidecar_to_children(EdgeSidecarToChildren edge_sidecar_to_children) {
		this.edge_sidecar_to_children = edge_sidecar_to_children;
	}

	EdgeSidecarToChildren edge_sidecar_to_children;

	@JsonProperty("edge_web_media_to_related_media")
	public EdgeWebMediaToRelatedMedia getEdge_web_media_to_related_media() {
		return this.edge_web_media_to_related_media;
	}

	public void setEdge_web_media_to_related_media(EdgeWebMediaToRelatedMedia edge_web_media_to_related_media) {
		this.edge_web_media_to_related_media = edge_web_media_to_related_media;
	}

	EdgeWebMediaToRelatedMedia edge_web_media_to_related_media;

	@JsonProperty("has_ranked_comments")
	public boolean getHas_ranked_comments() {
		return this.has_ranked_comments;
	}

	public void setHas_ranked_comments(boolean has_ranked_comments) {
		this.has_ranked_comments = has_ranked_comments;
	}

	boolean has_ranked_comments;

	@JsonProperty("iphone_struct")
	public IphoneStruct getIphone_struct() {
		return this.iphone_struct;
	}

	public void setIphone_struct(IphoneStruct iphone_struct) {
		this.iphone_struct = iphone_struct;
	}

	IphoneStruct iphone_struct;

	@JsonProperty("is_ad")
	public boolean getIs_ad() {
		return this.is_ad;
	}

	public void setIs_ad(boolean is_ad) {
		this.is_ad = is_ad;
	}

	boolean is_ad;

	@JsonProperty("location")
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	Location location;

	@JsonProperty("owner")
	public Owner getOwner() {
		return this.owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	Owner owner;

	@JsonProperty("taken_at_timestamp")
	public int getTaken_at_timestamp() {
		return this.taken_at_timestamp;
	}

	public void setTaken_at_timestamp(int taken_at_timestamp) {
		this.taken_at_timestamp = taken_at_timestamp;
	}

	int taken_at_timestamp;

	@JsonProperty("thumbnail_src")
	public String getThumbnail_src() {
		return this.thumbnail_src;
	}

	public void setThumbnail_src(String thumbnail_src) {
		this.thumbnail_src = thumbnail_src;
	}

	String thumbnail_src;

	@JsonProperty("viewer_can_reshare")
	public boolean getViewer_can_reshare() {
		return this.viewer_can_reshare;
	}

	public void setViewer_can_reshare(boolean viewer_can_reshare) {
		this.viewer_can_reshare = viewer_can_reshare;
	}

	boolean viewer_can_reshare;

	@JsonProperty("viewer_has_liked")
	public boolean getViewer_has_liked() {
		return this.viewer_has_liked;
	}

	public void setViewer_has_liked(boolean viewer_has_liked) {
		this.viewer_has_liked = viewer_has_liked;
	}

	boolean viewer_has_liked;

	@JsonProperty("viewer_has_saved")
	public boolean getViewer_has_saved() {
		return this.viewer_has_saved;
	}

	public void setViewer_has_saved(boolean viewer_has_saved) {
		this.viewer_has_saved = viewer_has_saved;
	}

	boolean viewer_has_saved;

	@JsonProperty("viewer_has_saved_to_collection")
	public boolean getViewer_has_saved_to_collection() {
		return this.viewer_has_saved_to_collection;
	}

	public void setViewer_has_saved_to_collection(boolean viewer_has_saved_to_collection) {
		this.viewer_has_saved_to_collection = viewer_has_saved_to_collection;
	}

	boolean viewer_has_saved_to_collection;

	@JsonProperty("viewer_in_photo_of_you")
	public boolean getViewer_in_photo_of_you() {
		return this.viewer_in_photo_of_you;
	}

	public void setViewer_in_photo_of_you(boolean viewer_in_photo_of_you) {
		this.viewer_in_photo_of_you = viewer_in_photo_of_you;
	}

	boolean viewer_in_photo_of_you;
}

class Edge {
	@JsonProperty("node")
	public Node getNode() {
		return this.node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	Node node;
}

class EdgeMediaPreviewLike {
	@JsonProperty("count")
	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	int count;

	@JsonProperty("edges")
	public List<Edge> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	List<Edge> edges;
}

class EdgeMediaToCaption {
	@JsonProperty("edges")
	public List<Edge> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	List<Edge> edges;
}

class PageInfo {
	@JsonProperty("end_cursor")
	public Object getEnd_cursor() {
		return this.end_cursor;
	}

	public void setEnd_cursor(Object end_cursor) {
		this.end_cursor = end_cursor;
	}

	Object end_cursor;

	@JsonProperty("has_next_page")
	public boolean getHas_next_page() {
		return this.has_next_page;
	}

	public void setHas_next_page(boolean has_next_page) {
		this.has_next_page = has_next_page;
	}

	boolean has_next_page;
}

class EdgeMediaToComment {
	@JsonProperty("count")
	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	int count;

	@JsonProperty("edges")
	public List<Object> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Object> edges) {
		this.edges = edges;
	}

	List<Object> edges;

	@JsonProperty("page_info")
	public PageInfo getPage_info() {
		return this.page_info;
	}

	public void setPage_info(PageInfo page_info) {
		this.page_info = page_info;
	}

	PageInfo page_info;
}

class EdgeMediaToSponsorUser {
	@JsonProperty("edges")
	public List<Object> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Object> edges) {
		this.edges = edges;
	}

	List<Object> edges;
}

class EdgeMediaToTaggedUser {
	@JsonProperty("edges")
	public List<Object> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Object> edges) {
		this.edges = edges;
	}

	List<Object> edges;
}

class EdgeSidecarToChildren {
	@JsonProperty("edges")
	public List<Edge> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	List<Edge> edges;
}

class EdgeWebMediaToRelatedMedia {
	@JsonProperty("edges")
	public List<Object> getEdges() {
		return this.edges;
	}

	public void setEdges(List<Object> edges) {
		this.edges = edges;
	}

	List<Object> edges;
}

class FriendshipStatus {
	@JsonProperty("following")
	public boolean getFollowing() {
		return this.following;
	}

	public void setFollowing(boolean following) {
		this.following = following;
	}

	boolean following;

	@JsonProperty("is_bestie")
	public boolean getIs_bestie() {
		return this.is_bestie;
	}

	public void setIs_bestie(boolean is_bestie) {
		this.is_bestie = is_bestie;
	}

	boolean is_bestie;

	@JsonProperty("is_restricted")
	public boolean getIs_restricted() {
		return this.is_restricted;
	}

	public void setIs_restricted(boolean is_restricted) {
		this.is_restricted = is_restricted;
	}

	boolean is_restricted;

	@JsonProperty("outgoing_request")
	public boolean getOutgoing_request() {
		return this.outgoing_request;
	}

	public void setOutgoing_request(boolean outgoing_request) {
		this.outgoing_request = outgoing_request;
	}

	boolean outgoing_request;
}

class User {
	@JsonProperty("account_badges")
	public List<Object> getAccount_badges() {
		return this.account_badges;
	}

	public void setAccount_badges(List<Object> account_badges) {
		this.account_badges = account_badges;
	}

	List<Object> account_badges;

	@JsonProperty("follow_friction_type")
	public int getFollow_friction_type() {
		return this.follow_friction_type;
	}

	public void setFollow_friction_type(int follow_friction_type) {
		this.follow_friction_type = follow_friction_type;
	}

	int follow_friction_type;

	@JsonProperty("friendship_status")
	public FriendshipStatus getFriendship_status() {
		return this.friendship_status;
	}

	public void setFriendship_status(FriendshipStatus friendship_status) {
		this.friendship_status = friendship_status;
	}

	FriendshipStatus friendship_status;

	@JsonProperty("full_name")
	public String getFull_name() {
		return this.full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	String full_name;

	@JsonProperty("has_anonymous_profile_picture")
	public boolean getHas_anonymous_profile_picture() {
		return this.has_anonymous_profile_picture;
	}

	public void setHas_anonymous_profile_picture(boolean has_anonymous_profile_picture) {
		this.has_anonymous_profile_picture = has_anonymous_profile_picture;
	}

	boolean has_anonymous_profile_picture;

	@JsonProperty("is_favorite")
	public boolean getIs_favorite() {
		return this.is_favorite;
	}

	public void setIs_favorite(boolean is_favorite) {
		this.is_favorite = is_favorite;
	}

	boolean is_favorite;

	@JsonProperty("is_private")
	public boolean getIs_private() {
		return this.is_private;
	}

	public void setIs_private(boolean is_private) {
		this.is_private = is_private;
	}

	boolean is_private;

	@JsonProperty("is_unpublished")
	public boolean getIs_unpublished() {
		return this.is_unpublished;
	}

	public void setIs_unpublished(boolean is_unpublished) {
		this.is_unpublished = is_unpublished;
	}

	boolean is_unpublished;

	@JsonProperty("is_verified")
	public boolean getIs_verified() {
		return this.is_verified;
	}

	public void setIs_verified(boolean is_verified) {
		this.is_verified = is_verified;
	}

	boolean is_verified;

	@JsonProperty("latest_reel_media")
	public int getLatest_reel_media() {
		return this.latest_reel_media;
	}

	public void setLatest_reel_media(int latest_reel_media) {
		this.latest_reel_media = latest_reel_media;
	}

	int latest_reel_media;

	@JsonProperty("pk")
	public long getPk() {
		return this.pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	long pk;

	@JsonProperty("profile_pic_id")
	public String getProfile_pic_id() {
		return this.profile_pic_id;
	}

	public void setProfile_pic_id(String profile_pic_id) {
		this.profile_pic_id = profile_pic_id;
	}

	String profile_pic_id;

	@JsonProperty("profile_pic_url")
	public String getProfile_pic_url() {
		return this.profile_pic_url;
	}

	public void setProfile_pic_url(String profile_pic_url) {
		this.profile_pic_url = profile_pic_url;
	}

	String profile_pic_url;

	@JsonProperty("username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	String username;
}

class Caption {
	@JsonProperty("bit_flags")
	public int getBit_flags() {
		return this.bit_flags;
	}

	public void setBit_flags(int bit_flags) {
		this.bit_flags = bit_flags;
	}

	int bit_flags;

	@JsonProperty("content_type")
	public String getContent_type() {
		return this.content_type;
	}

	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}

	String content_type;

	@JsonProperty("created_at")
	public int getCreated_at() {
		return this.created_at;
	}

	public void setCreated_at(int created_at) {
		this.created_at = created_at;
	}

	int created_at;

	@JsonProperty("created_at_utc")
	public int getCreated_at_utc() {
		return this.created_at_utc;
	}

	public void setCreated_at_utc(int created_at_utc) {
		this.created_at_utc = created_at_utc;
	}

	int created_at_utc;

	@JsonProperty("did_report_as_spam")
	public boolean getDid_report_as_spam() {
		return this.did_report_as_spam;
	}

	public void setDid_report_as_spam(boolean did_report_as_spam) {
		this.did_report_as_spam = did_report_as_spam;
	}

	boolean did_report_as_spam;

	@JsonProperty("has_translation")
	public boolean getHas_translation() {
		return this.has_translation;
	}

	public void setHas_translation(boolean has_translation) {
		this.has_translation = has_translation;
	}

	boolean has_translation;

	@JsonProperty("is_covered")
	public boolean getIs_covered() {
		return this.is_covered;
	}

	public void setIs_covered(boolean is_covered) {
		this.is_covered = is_covered;
	}

	boolean is_covered;

	@JsonProperty("media_id")
	public long getMedia_id() {
		return this.media_id;
	}

	public void setMedia_id(long media_id) {
		this.media_id = media_id;
	}

	long media_id;

	@JsonProperty("pk")
	public long getPk() {
		return this.pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	long pk;

	@JsonProperty("private_reply_status")
	public int getPrivate_reply_status() {
		return this.private_reply_status;
	}

	public void setPrivate_reply_status(int private_reply_status) {
		this.private_reply_status = private_reply_status;
	}

	int private_reply_status;

	@JsonProperty("share_enabled")
	public boolean getShare_enabled() {
		return this.share_enabled;
	}

	public void setShare_enabled(boolean share_enabled) {
		this.share_enabled = share_enabled;
	}

	boolean share_enabled;

	@JsonProperty("status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	String status;

	@JsonProperty("text")
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	String text;

	@JsonProperty("type")
	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	int type;

	@JsonProperty("user")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	User user;

	@JsonProperty("user_id")
	public long getUser_id() {
		return this.user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	long user_id;
}

class Candidate {
	@JsonProperty("height")
	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	int height;

	@JsonProperty("scans_profile")
	public String getScans_profile() {
		return this.scans_profile;
	}

	public void setScans_profile(String scans_profile) {
		this.scans_profile = scans_profile;
	}

	String scans_profile;

	@JsonProperty("url")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	String url;

	@JsonProperty("width")
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	int width;
}

class ImageVersions2 {
	@JsonProperty("candidates")
	public List<Candidate> getCandidates() {
		return this.candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	List<Candidate> candidates;
}

class SharingFrictionInfo {
	@JsonProperty("bloks_app_url")
	public Object getBloks_app_url() {
		return this.bloks_app_url;
	}

	public void setBloks_app_url(Object bloks_app_url) {
		this.bloks_app_url = bloks_app_url;
	}

	Object bloks_app_url;

	@JsonProperty("should_have_sharing_friction")
	public boolean getShould_have_sharing_friction() {
		return this.should_have_sharing_friction;
	}

	public void setShould_have_sharing_friction(boolean should_have_sharing_friction) {
		this.should_have_sharing_friction = should_have_sharing_friction;
	}

	boolean should_have_sharing_friction;
}

class CarouselMedia {
	@JsonProperty("can_see_insights_as_brand")
	public boolean getCan_see_insights_as_brand() {
		return this.can_see_insights_as_brand;
	}

	public void setCan_see_insights_as_brand(boolean can_see_insights_as_brand) {
		this.can_see_insights_as_brand = can_see_insights_as_brand;
	}

	boolean can_see_insights_as_brand;

	@JsonProperty("carousel_parent_id")
	public String getCarousel_parent_id() {
		return this.carousel_parent_id;
	}

	public void setCarousel_parent_id(String carousel_parent_id) {
		this.carousel_parent_id = carousel_parent_id;
	}

	String carousel_parent_id;

	@JsonProperty("commerciality_status")
	public String getCommerciality_status() {
		return this.commerciality_status;
	}

	public void setCommerciality_status(String commerciality_status) {
		this.commerciality_status = commerciality_status;
	}

	String commerciality_status;

	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;

	@JsonProperty("image_versions2")
	public ImageVersions2 getImage_versions2() {
		return this.image_versions2;
	}

	public void setImage_versions2(ImageVersions2 image_versions2) {
		this.image_versions2 = image_versions2;
	}

	ImageVersions2 image_versions2;

	@JsonProperty("is_commercial")
	public boolean getIs_commercial() {
		return this.is_commercial;
	}

	public void setIs_commercial(boolean is_commercial) {
		this.is_commercial = is_commercial;
	}

	boolean is_commercial;

	@JsonProperty("media_type")
	public int getMedia_type() {
		return this.media_type;
	}

	public void setMedia_type(int media_type) {
		this.media_type = media_type;
	}

	int media_type;

	@JsonProperty("original_height")
	public int getOriginal_height() {
		return this.original_height;
	}

	public void setOriginal_height(int original_height) {
		this.original_height = original_height;
	}

	int original_height;

	@JsonProperty("original_width")
	public int getOriginal_width() {
		return this.original_width;
	}

	public void setOriginal_width(int original_width) {
		this.original_width = original_width;
	}

	int original_width;

	@JsonProperty("pk")
	public Object getPk() {
		return this.pk;
	}

	public void setPk(Object pk) {
		this.pk = pk;
	}

	Object pk;

	@JsonProperty("sharing_friction_info")
	public SharingFrictionInfo getSharing_friction_info() {
		return this.sharing_friction_info;
	}

	public void setSharing_friction_info(SharingFrictionInfo sharing_friction_info) {
		this.sharing_friction_info = sharing_friction_info;
	}

	SharingFrictionInfo sharing_friction_info;
}

class FacepileTopLiker {
	@JsonProperty("follow_friction_type")
	public int getFollow_friction_type() {
		return this.follow_friction_type;
	}

	public void setFollow_friction_type(int follow_friction_type) {
		this.follow_friction_type = follow_friction_type;
	}

	int follow_friction_type;

	@JsonProperty("full_name")
	public String getFull_name() {
		return this.full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	String full_name;

	@JsonProperty("is_private")
	public boolean getIs_private() {
		return this.is_private;
	}

	public void setIs_private(boolean is_private) {
		this.is_private = is_private;
	}

	boolean is_private;

	@JsonProperty("is_verified")
	public boolean getIs_verified() {
		return this.is_verified;
	}

	public void setIs_verified(boolean is_verified) {
		this.is_verified = is_verified;
	}

	boolean is_verified;

	@JsonProperty("pk")
	public Object getPk() {
		return this.pk;
	}

	public void setPk(Object pk) {
		this.pk = pk;
	}

	Object pk;

	@JsonProperty("profile_pic_id")
	public String getProfile_pic_id() {
		return this.profile_pic_id;
	}

	public void setProfile_pic_id(String profile_pic_id) {
		this.profile_pic_id = profile_pic_id;
	}

	String profile_pic_id;

	@JsonProperty("profile_pic_url")
	public String getProfile_pic_url() {
		return this.profile_pic_url;
	}

	public void setProfile_pic_url(String profile_pic_url) {
		this.profile_pic_url = profile_pic_url;
	}

	String profile_pic_url;

	@JsonProperty("username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	String username;
}

class LikerConfig {
	@JsonProperty("ads_display_mode")
	public int getAds_display_mode() {
		return this.ads_display_mode;
	}

	public void setAds_display_mode(int ads_display_mode) {
		this.ads_display_mode = ads_display_mode;
	}

	int ads_display_mode;

	@JsonProperty("disable_liker_list_navigation")
	public boolean getDisable_liker_list_navigation() {
		return this.disable_liker_list_navigation;
	}

	public void setDisable_liker_list_navigation(boolean disable_liker_list_navigation) {
		this.disable_liker_list_navigation = disable_liker_list_navigation;
	}

	boolean disable_liker_list_navigation;

	@JsonProperty("display_mode")
	public int getDisplay_mode() {
		return this.display_mode;
	}

	public void setDisplay_mode(int display_mode) {
		this.display_mode = display_mode;
	}

	int display_mode;

	@JsonProperty("hide_view_count")
	public boolean getHide_view_count() {
		return this.hide_view_count;
	}

	public void setHide_view_count(boolean hide_view_count) {
		this.hide_view_count = hide_view_count;
	}

	boolean hide_view_count;

	@JsonProperty("is_daisy")
	public boolean getIs_daisy() {
		return this.is_daisy;
	}

	public void setIs_daisy(boolean is_daisy) {
		this.is_daisy = is_daisy;
	}

	boolean is_daisy;

	@JsonProperty("is_in_daisy_controls")
	public boolean getIs_in_daisy_controls() {
		return this.is_in_daisy_controls;
	}

	public void setIs_in_daisy_controls(boolean is_in_daisy_controls) {
		this.is_in_daisy_controls = is_in_daisy_controls;
	}

	boolean is_in_daisy_controls;

	@JsonProperty("show_author_view_likes_button")
	public boolean getShow_author_view_likes_button() {
		return this.show_author_view_likes_button;
	}

	public void setShow_author_view_likes_button(boolean show_author_view_likes_button) {
		this.show_author_view_likes_button = show_author_view_likes_button;
	}

	boolean show_author_view_likes_button;

	@JsonProperty("show_count_in_likers_list")
	public boolean getShow_count_in_likers_list() {
		return this.show_count_in_likers_list;
	}

	public void setShow_count_in_likers_list(boolean show_count_in_likers_list) {
		this.show_count_in_likers_list = show_count_in_likers_list;
	}

	boolean show_count_in_likers_list;

	@JsonProperty("show_daisy_liker_list_header")
	public boolean getShow_daisy_liker_list_header() {
		return this.show_daisy_liker_list_header;
	}

	public void setShow_daisy_liker_list_header(boolean show_daisy_liker_list_header) {
		this.show_daisy_liker_list_header = show_daisy_liker_list_header;
	}

	boolean show_daisy_liker_list_header;

	@JsonProperty("show_learn_more")
	public boolean getShow_learn_more() {
		return this.show_learn_more;
	}

	public void setShow_learn_more(boolean show_learn_more) {
		this.show_learn_more = show_learn_more;
	}

	boolean show_learn_more;

	@JsonProperty("show_view_count_in_likers_list")
	public boolean getShow_view_count_in_likers_list() {
		return this.show_view_count_in_likers_list;
	}

	public void setShow_view_count_in_likers_list(boolean show_view_count_in_likers_list) {
		this.show_view_count_in_likers_list = show_view_count_in_likers_list;
	}

	boolean show_view_count_in_likers_list;
}

class Location {
	@JsonProperty("address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	String address;

	@JsonProperty("city")
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	String city;

	@JsonProperty("external_source")
	public String getExternal_source() {
		return this.external_source;
	}

	public void setExternal_source(String external_source) {
		this.external_source = external_source;
	}

	String external_source;

	@JsonProperty("facebook_places_id")
	public long getFacebook_places_id() {
		return this.facebook_places_id;
	}

	public void setFacebook_places_id(long facebook_places_id) {
		this.facebook_places_id = facebook_places_id;
	}

	long facebook_places_id;

	@JsonProperty("has_viewer_saved")
	public Object getHas_viewer_saved() {
		return this.has_viewer_saved;
	}

	public void setHas_viewer_saved(Object has_viewer_saved) {
		this.has_viewer_saved = has_viewer_saved;
	}

	Object has_viewer_saved;

	@JsonProperty("is_eligible_for_guides")
	public boolean getIs_eligible_for_guides() {
		return this.is_eligible_for_guides;
	}

	public void setIs_eligible_for_guides(boolean is_eligible_for_guides) {
		this.is_eligible_for_guides = is_eligible_for_guides;
	}

	boolean is_eligible_for_guides;

	@JsonProperty("lat")
	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	double lat;

	@JsonProperty("lng")
	public double getLng() {
		return this.lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	double lng;

	@JsonProperty("name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	@JsonProperty("pk")
	public int getPk() {
		return this.pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	int pk;

	@JsonProperty("short_name")
	public String getShort_name() {
		return this.short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	String short_name;

	@JsonProperty("address_json")
	public String getAddress_json() {
		return this.address_json;
	}

	public void setAddress_json(String address_json) {
		this.address_json = address_json;
	}

	String address_json;

	@JsonProperty("has_public_page")
	public boolean getHas_public_page() {
		return this.has_public_page;
	}

	public void setHas_public_page(boolean has_public_page) {
		this.has_public_page = has_public_page;
	}

	boolean has_public_page;

	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;

	@JsonProperty("slug")
	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	String slug;
}

class IphoneStruct {
	@JsonProperty("bucketed_like_count")
	public int getBucketed_like_count() {
		return this.bucketed_like_count;
	}

	public void setBucketed_like_count(int bucketed_like_count) {
		this.bucketed_like_count = bucketed_like_count;
	}

	int bucketed_like_count;

	@JsonProperty("can_see_insights_as_brand")
	public boolean getCan_see_insights_as_brand() {
		return this.can_see_insights_as_brand;
	}

	public void setCan_see_insights_as_brand(boolean can_see_insights_as_brand) {
		this.can_see_insights_as_brand = can_see_insights_as_brand;
	}

	boolean can_see_insights_as_brand;

	@JsonProperty("can_viewer_reshare")
	public boolean getCan_viewer_reshare() {
		return this.can_viewer_reshare;
	}

	public void setCan_viewer_reshare(boolean can_viewer_reshare) {
		this.can_viewer_reshare = can_viewer_reshare;
	}

	boolean can_viewer_reshare;

	@JsonProperty("can_viewer_save")
	public boolean getCan_viewer_save() {
		return this.can_viewer_save;
	}

	public void setCan_viewer_save(boolean can_viewer_save) {
		this.can_viewer_save = can_viewer_save;
	}

	boolean can_viewer_save;

	@JsonProperty("caption")
	public Caption getCaption() {
		return this.caption;
	}

	public void setCaption(Caption caption) {
		this.caption = caption;
	}

	Caption caption;

	@JsonProperty("caption_is_edited")
	public boolean getCaption_is_edited() {
		return this.caption_is_edited;
	}

	public void setCaption_is_edited(boolean caption_is_edited) {
		this.caption_is_edited = caption_is_edited;
	}

	boolean caption_is_edited;

	@JsonProperty("carousel_media")
	public List<CarouselMedia> getCarousel_media() {
		return this.carousel_media;
	}

	public void setCarousel_media(List<CarouselMedia> carousel_media) {
		this.carousel_media = carousel_media;
	}

	List<CarouselMedia> carousel_media;

	@JsonProperty("carousel_media_count")
	public int getCarousel_media_count() {
		return this.carousel_media_count;
	}

	public void setCarousel_media_count(int carousel_media_count) {
		this.carousel_media_count = carousel_media_count;
	}

	int carousel_media_count;

	@JsonProperty("client_cache_key")
	public String getClient_cache_key() {
		return this.client_cache_key;
	}

	public void setClient_cache_key(String client_cache_key) {
		this.client_cache_key = client_cache_key;
	}

	String client_cache_key;

	@JsonProperty("code")
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	String code;

	@JsonProperty("comments_disabled")
	public boolean getComments_disabled() {
		return this.comments_disabled;
	}

	public void setComments_disabled(boolean comments_disabled) {
		this.comments_disabled = comments_disabled;
	}

	boolean comments_disabled;

	@JsonProperty("commerciality_status")
	public String getCommerciality_status() {
		return this.commerciality_status;
	}

	public void setCommerciality_status(String commerciality_status) {
		this.commerciality_status = commerciality_status;
	}

	String commerciality_status;

	@JsonProperty("deleted_reason")
	public int getDeleted_reason() {
		return this.deleted_reason;
	}

	public void setDeleted_reason(int deleted_reason) {
		this.deleted_reason = deleted_reason;
	}

	int deleted_reason;

	@JsonProperty("device_timestamp")
	public long getDevice_timestamp() {
		return this.device_timestamp;
	}

	public void setDevice_timestamp(long device_timestamp) {
		this.device_timestamp = device_timestamp;
	}

	long device_timestamp;

	@JsonProperty("facepile_top_likers")
	public List<FacepileTopLiker> getFacepile_top_likers() {
		return this.facepile_top_likers;
	}

	public void setFacepile_top_likers(List<FacepileTopLiker> facepile_top_likers) {
		this.facepile_top_likers = facepile_top_likers;
	}

	List<FacepileTopLiker> facepile_top_likers;

	@JsonProperty("featured_products_cta")
	public Object getFeatured_products_cta() {
		return this.featured_products_cta;
	}

	public void setFeatured_products_cta(Object featured_products_cta) {
		this.featured_products_cta = featured_products_cta;
	}

	Object featured_products_cta;

	@JsonProperty("filter_type")
	public int getFilter_type() {
		return this.filter_type;
	}

	public void setFilter_type(int filter_type) {
		this.filter_type = filter_type;
	}

	int filter_type;

	@JsonProperty("has_liked")
	public boolean getHas_liked() {
		return this.has_liked;
	}

	public void setHas_liked(boolean has_liked) {
		this.has_liked = has_liked;
	}

	boolean has_liked;

	@JsonProperty("has_viewer_saved")
	public boolean getHas_viewer_saved() {
		return this.has_viewer_saved;
	}

	public void setHas_viewer_saved(boolean has_viewer_saved) {
		this.has_viewer_saved = has_viewer_saved;
	}

	boolean has_viewer_saved;

	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;

	@JsonProperty("integrity_review_decision")
	public String getIntegrity_review_decision() {
		return this.integrity_review_decision;
	}

	public void setIntegrity_review_decision(String integrity_review_decision) {
		this.integrity_review_decision = integrity_review_decision;
	}

	String integrity_review_decision;

	@JsonProperty("is_commercial")
	public boolean getIs_commercial() {
		return this.is_commercial;
	}

	public void setIs_commercial(boolean is_commercial) {
		this.is_commercial = is_commercial;
	}

	boolean is_commercial;

	@JsonProperty("is_in_profile_grid")
	public boolean getIs_in_profile_grid() {
		return this.is_in_profile_grid;
	}

	public void setIs_in_profile_grid(boolean is_in_profile_grid) {
		this.is_in_profile_grid = is_in_profile_grid;
	}

	boolean is_in_profile_grid;

	@JsonProperty("is_paid_partnership")
	public boolean getIs_paid_partnership() {
		return this.is_paid_partnership;
	}

	public void setIs_paid_partnership(boolean is_paid_partnership) {
		this.is_paid_partnership = is_paid_partnership;
	}

	boolean is_paid_partnership;

	@JsonProperty("is_unified_video")
	public boolean getIs_unified_video() {
		return this.is_unified_video;
	}

	public void setIs_unified_video(boolean is_unified_video) {
		this.is_unified_video = is_unified_video;
	}

	boolean is_unified_video;

	@JsonProperty("lat")
	public double getLat() {
		return this.lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	double lat;

	@JsonProperty("like_and_view_counts_disabled")
	public boolean getLike_and_view_counts_disabled() {
		return this.like_and_view_counts_disabled;
	}

	public void setLike_and_view_counts_disabled(boolean like_and_view_counts_disabled) {
		this.like_and_view_counts_disabled = like_and_view_counts_disabled;
	}

	boolean like_and_view_counts_disabled;

	@JsonProperty("like_count")
	public int getLike_count() {
		return this.like_count;
	}

	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}

	int like_count;

	@JsonProperty("liker_config")
	public LikerConfig getLiker_config() {
		return this.liker_config;
	}

	public void setLiker_config(LikerConfig liker_config) {
		this.liker_config = liker_config;
	}

	LikerConfig liker_config;

	@JsonProperty("lng")
	public double getLng() {
		return this.lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	double lng;

	@JsonProperty("location")
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	Location location;

	@JsonProperty("media_type")
	public int getMedia_type() {
		return this.media_type;
	}

	public void setMedia_type(int media_type) {
		this.media_type = media_type;
	}

	int media_type;

	@JsonProperty("organic_tracking_token")
	public String getOrganic_tracking_token() {
		return this.organic_tracking_token;
	}

	public void setOrganic_tracking_token(String organic_tracking_token) {
		this.organic_tracking_token = organic_tracking_token;
	}

	String organic_tracking_token;

	@JsonProperty("photo_of_you")
	public boolean getPhoto_of_you() {
		return this.photo_of_you;
	}

	public void setPhoto_of_you(boolean photo_of_you) {
		this.photo_of_you = photo_of_you;
	}

	boolean photo_of_you;

	@JsonProperty("pk")
	public long getPk() {
		return this.pk;
	}

	public void setPk(long pk) {
		this.pk = pk;
	}

	long pk;

	@JsonProperty("product_type")
	public String getProduct_type() {
		return this.product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	String product_type;

	@JsonProperty("profile_grid_control_enabled")
	public boolean getProfile_grid_control_enabled() {
		return this.profile_grid_control_enabled;
	}

	public void setProfile_grid_control_enabled(boolean profile_grid_control_enabled) {
		this.profile_grid_control_enabled = profile_grid_control_enabled;
	}

	boolean profile_grid_control_enabled;

	@JsonProperty("saved_collection_ids")
	public List<Object> getSaved_collection_ids() {
		return this.saved_collection_ids;
	}

	public void setSaved_collection_ids(List<Object> saved_collection_ids) {
		this.saved_collection_ids = saved_collection_ids;
	}

	List<Object> saved_collection_ids;

	@JsonProperty("sharing_friction_info")
	public SharingFrictionInfo getSharing_friction_info() {
		return this.sharing_friction_info;
	}

	public void setSharing_friction_info(SharingFrictionInfo sharing_friction_info) {
		this.sharing_friction_info = sharing_friction_info;
	}

	SharingFrictionInfo sharing_friction_info;

	@JsonProperty("taken_at")
	public int getTaken_at() {
		return this.taken_at;
	}

	public void setTaken_at(int taken_at) {
		this.taken_at = taken_at;
	}

	int taken_at;

	@JsonProperty("top_likers")
	public List<String> getTop_likers() {
		return this.top_likers;
	}

	public void setTop_likers(List<String> top_likers) {
		this.top_likers = top_likers;
	}

	List<String> top_likers;

	@JsonProperty("user")
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	User user;
}

class Owner {
	@JsonProperty("blocked_by_viewer")
	public boolean getBlocked_by_viewer() {
		return this.blocked_by_viewer;
	}

	public void setBlocked_by_viewer(boolean blocked_by_viewer) {
		this.blocked_by_viewer = blocked_by_viewer;
	}

	boolean blocked_by_viewer;

	@JsonProperty("followed_by_viewer")
	public boolean getFollowed_by_viewer() {
		return this.followed_by_viewer;
	}

	public void setFollowed_by_viewer(boolean followed_by_viewer) {
		this.followed_by_viewer = followed_by_viewer;
	}

	boolean followed_by_viewer;

	@JsonProperty("full_name")
	public String getFull_name() {
		return this.full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	String full_name;

	@JsonProperty("has_blocked_viewer")
	public boolean getHas_blocked_viewer() {
		return this.has_blocked_viewer;
	}

	public void setHas_blocked_viewer(boolean has_blocked_viewer) {
		this.has_blocked_viewer = has_blocked_viewer;
	}

	boolean has_blocked_viewer;

	@JsonProperty("id")
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;

	@JsonProperty("is_private")
	public boolean getIs_private() {
		return this.is_private;
	}

	public void setIs_private(boolean is_private) {
		this.is_private = is_private;
	}

	boolean is_private;

	@JsonProperty("is_unpublished")
	public boolean getIs_unpublished() {
		return this.is_unpublished;
	}

	public void setIs_unpublished(boolean is_unpublished) {
		this.is_unpublished = is_unpublished;
	}

	boolean is_unpublished;

	@JsonProperty("is_verified")
	public boolean getIs_verified() {
		return this.is_verified;
	}

	public void setIs_verified(boolean is_verified) {
		this.is_verified = is_verified;
	}

	boolean is_verified;

	@JsonProperty("profile_pic_url")
	public String getProfile_pic_url() {
		return this.profile_pic_url;
	}

	public void setProfile_pic_url(String profile_pic_url) {
		this.profile_pic_url = profile_pic_url;
	}

	String profile_pic_url;

	@JsonProperty("requested_by_viewer")
	public boolean getRequested_by_viewer() {
		return this.requested_by_viewer;
	}

	public void setRequested_by_viewer(boolean requested_by_viewer) {
		this.requested_by_viewer = requested_by_viewer;
	}

	boolean requested_by_viewer;

	@JsonProperty("username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	String username;
}

public class GraphSidecar {
	@JsonProperty("instaloader")
	public Instaloader getInstaloader() {
		return this.instaloader;
	}

	public void setInstaloader(Instaloader instaloader) {
		this.instaloader = instaloader;
	}

	Instaloader instaloader;

	@JsonProperty("node")
	public Node getNode() {
		return this.node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	Node node;
}
