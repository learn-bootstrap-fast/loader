package com.amberance.video;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
class Instaloader{
    @JsonProperty("node_type") 
    public String getNode_type() { 
		 return this.node_type; } 
    public void setNode_type(String node_type) { 
		 this.node_type = node_type; } 
    String node_type;
    @JsonProperty("version") 
    public String getVersion() { 
		 return this.version; } 
    public void setVersion(String version) { 
		 this.version = version; } 
    String version;
}

class Dimensions{
    @JsonProperty("height") 
    public int getHeight() { 
		 return this.height; } 
    public void setHeight(int height) { 
		 this.height = height; } 
    int height;
    @JsonProperty("width") 
    public int getWidth() { 
		 return this.width; } 
    public void setWidth(int width) { 
		 this.width = width; } 
    int width;
}

class EdgeLikedBy{
    @JsonProperty("count") 
    public int getCount() { 
		 return this.count; } 
    public void setCount(int count) { 
		 this.count = count; } 
    int count;
}

class EdgeMediaPreviewLike{
    @JsonProperty("count") 
    public int getCount() { 
		 return this.count; } 
    public void setCount(int count) { 
		 this.count = count; } 
    int count;
}

class Node{
    @JsonProperty("text") 
    public String getText() { 
		 return this.text; } 
    public void setText(String text) { 
		 this.text = text; } 
    String text;
    @JsonProperty("__typename") 
    public String get__typename() { 
		 return this.__typename; } 
    public void set__typename(String __typename) { 
		 this.__typename = __typename; } 
    String __typename;
    @JsonProperty("comments_disabled") 
    public boolean getComments_disabled() { 
		 return this.comments_disabled; } 
    public void setComments_disabled(boolean comments_disabled) { 
		 this.comments_disabled = comments_disabled; } 
    boolean comments_disabled;
    @JsonProperty("dimensions") 
    public Dimensions getDimensions() { 
		 return this.dimensions; } 
    public void setDimensions(Dimensions dimensions) { 
		 this.dimensions = dimensions; } 
    Dimensions dimensions;
    @JsonProperty("display_url") 
    public String getDisplay_url() { 
		 return this.display_url; } 
    public void setDisplay_url(String display_url) { 
		 this.display_url = display_url; } 
    String display_url;
    @JsonProperty("edge_liked_by") 
    public EdgeLikedBy getEdge_liked_by() { 
		 return this.edge_liked_by; } 
    public void setEdge_liked_by(EdgeLikedBy edge_liked_by) { 
		 this.edge_liked_by = edge_liked_by; } 
    EdgeLikedBy edge_liked_by;
    @JsonProperty("edge_media_preview_like") 
    public EdgeMediaPreviewLike getEdge_media_preview_like() { 
		 return this.edge_media_preview_like; } 
    public void setEdge_media_preview_like(EdgeMediaPreviewLike edge_media_preview_like) { 
		 this.edge_media_preview_like = edge_media_preview_like; } 
    EdgeMediaPreviewLike edge_media_preview_like;
    @JsonProperty("edge_media_to_caption") 
    public EdgeMediaToCaption getEdge_media_to_caption() { 
		 return this.edge_media_to_caption; } 
    public void setEdge_media_to_caption(EdgeMediaToCaption edge_media_to_caption) { 
		 this.edge_media_to_caption = edge_media_to_caption; } 
    EdgeMediaToCaption edge_media_to_caption;
    @JsonProperty("edge_media_to_comment") 
    public EdgeMediaToComment getEdge_media_to_comment() { 
		 return this.edge_media_to_comment; } 
    public void setEdge_media_to_comment(EdgeMediaToComment edge_media_to_comment) { 
		 this.edge_media_to_comment = edge_media_to_comment; } 
    EdgeMediaToComment edge_media_to_comment;
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("iphone_struct") 
    public IphoneStruct getIphone_struct() { 
		 return this.iphone_struct; } 
    public void setIphone_struct(IphoneStruct iphone_struct) { 
		 this.iphone_struct = iphone_struct; } 
    IphoneStruct iphone_struct;
    @JsonProperty("is_video") 
    public boolean getIs_video() { 
		 return this.is_video; } 
    public void setIs_video(boolean is_video) { 
		 this.is_video = is_video; } 
    boolean is_video;
    @JsonProperty("owner") 
    public Owner getOwner() { 
		 return this.owner; } 
    public void setOwner(Owner owner) { 
		 this.owner = owner; } 
    Owner owner;
    @JsonProperty("shortcode") 
    public String getShortcode() { 
		 return this.shortcode; } 
    public void setShortcode(String shortcode) { 
		 this.shortcode = shortcode; } 
    String shortcode;
    @JsonProperty("taken_at_timestamp") 
    public int getTaken_at_timestamp() { 
		 return this.taken_at_timestamp; } 
    public void setTaken_at_timestamp(int taken_at_timestamp) { 
		 this.taken_at_timestamp = taken_at_timestamp; } 
    int taken_at_timestamp;
    @JsonProperty("thumbnail_src") 
    public String getThumbnail_src() { 
		 return this.thumbnail_src; } 
    public void setThumbnail_src(String thumbnail_src) { 
		 this.thumbnail_src = thumbnail_src; } 
    String thumbnail_src;
    @JsonProperty("video_view_count") 
    public int getVideo_view_count() { 
		 return this.video_view_count; } 
    public void setVideo_view_count(int video_view_count) { 
		 this.video_view_count = video_view_count; } 
    int video_view_count;
}

class Edge{
    @JsonProperty("node") 
    public Node getNode() { 
		 return this.node; } 
    public void setNode(Node node) { 
		 this.node = node; } 
    Node node;
}

class EdgeMediaToCaption{
    @JsonProperty("edges") 
    public List<Edge> getEdges() { 
		 return this.edges; } 
    public void setEdges(List<Edge> edges) { 
		 this.edges = edges; } 
    List<Edge> edges;
}

class EdgeMediaToComment{
    @JsonProperty("count") 
    public int getCount() { 
		 return this.count; } 
    public void setCount(int count) { 
		 this.count = count; } 
    int count;
}

class FriendshipStatus{
    @JsonProperty("following") 
    public boolean getFollowing() { 
		 return this.following; } 
    public void setFollowing(boolean following) { 
		 this.following = following; } 
    boolean following;
    @JsonProperty("is_bestie") 
    public boolean getIs_bestie() { 
		 return this.is_bestie; } 
    public void setIs_bestie(boolean is_bestie) { 
		 this.is_bestie = is_bestie; } 
    boolean is_bestie;
    @JsonProperty("is_restricted") 
    public boolean getIs_restricted() { 
		 return this.is_restricted; } 
    public void setIs_restricted(boolean is_restricted) { 
		 this.is_restricted = is_restricted; } 
    boolean is_restricted;
    @JsonProperty("outgoing_request") 
    public boolean getOutgoing_request() { 
		 return this.outgoing_request; } 
    public void setOutgoing_request(boolean outgoing_request) { 
		 this.outgoing_request = outgoing_request; } 
    boolean outgoing_request;
}

class User{
    @JsonProperty("account_badges") 
    public List<Object> getAccount_badges() { 
		 return this.account_badges; } 
    public void setAccount_badges(List<Object> account_badges) { 
		 this.account_badges = account_badges; } 
    List<Object> account_badges;
    @JsonProperty("follow_friction_type") 
    public int getFollow_friction_type() { 
		 return this.follow_friction_type; } 
    public void setFollow_friction_type(int follow_friction_type) { 
		 this.follow_friction_type = follow_friction_type; } 
    int follow_friction_type;
    @JsonProperty("friendship_status") 
    public FriendshipStatus getFriendship_status() { 
		 return this.friendship_status; } 
    public void setFriendship_status(FriendshipStatus friendship_status) { 
		 this.friendship_status = friendship_status; } 
    FriendshipStatus friendship_status;
    @JsonProperty("full_name") 
    public String getFull_name() { 
		 return this.full_name; } 
    public void setFull_name(String full_name) { 
		 this.full_name = full_name; } 
    String full_name;
    @JsonProperty("has_anonymous_profile_picture") 
    public boolean getHas_anonymous_profile_picture() { 
		 return this.has_anonymous_profile_picture; } 
    public void setHas_anonymous_profile_picture(boolean has_anonymous_profile_picture) { 
		 this.has_anonymous_profile_picture = has_anonymous_profile_picture; } 
    boolean has_anonymous_profile_picture;
    @JsonProperty("is_favorite") 
    public boolean getIs_favorite() { 
		 return this.is_favorite; } 
    public void setIs_favorite(boolean is_favorite) { 
		 this.is_favorite = is_favorite; } 
    boolean is_favorite;
    @JsonProperty("is_private") 
    public boolean getIs_private() { 
		 return this.is_private; } 
    public void setIs_private(boolean is_private) { 
		 this.is_private = is_private; } 
    boolean is_private;
    @JsonProperty("is_unpublished") 
    public boolean getIs_unpublished() { 
		 return this.is_unpublished; } 
    public void setIs_unpublished(boolean is_unpublished) { 
		 this.is_unpublished = is_unpublished; } 
    boolean is_unpublished;
    @JsonProperty("is_verified") 
    public boolean getIs_verified() { 
		 return this.is_verified; } 
    public void setIs_verified(boolean is_verified) { 
		 this.is_verified = is_verified; } 
    boolean is_verified;
    @JsonProperty("latest_reel_media") 
    public int getLatest_reel_media() { 
		 return this.latest_reel_media; } 
    public void setLatest_reel_media(int latest_reel_media) { 
		 this.latest_reel_media = latest_reel_media; } 
    int latest_reel_media;
    @JsonProperty("pk") 
    public long getPk() { 
		 return this.pk; } 
    public void setPk(long pk) { 
		 this.pk = pk; } 
    long pk;
    @JsonProperty("profile_pic_id") 
    public String getProfile_pic_id() { 
		 return this.profile_pic_id; } 
    public void setProfile_pic_id(String profile_pic_id) { 
		 this.profile_pic_id = profile_pic_id; } 
    String profile_pic_id;
    @JsonProperty("profile_pic_url") 
    public String getProfile_pic_url() { 
		 return this.profile_pic_url; } 
    public void setProfile_pic_url(String profile_pic_url) { 
		 this.profile_pic_url = profile_pic_url; } 
    String profile_pic_url;
    @JsonProperty("username") 
    public String getUsername() { 
		 return this.username; } 
    public void setUsername(String username) { 
		 this.username = username; } 
    String username;
}

class Caption{
    @JsonProperty("bit_flags") 
    public int getBit_flags() { 
		 return this.bit_flags; } 
    public void setBit_flags(int bit_flags) { 
		 this.bit_flags = bit_flags; } 
    int bit_flags;
    @JsonProperty("content_type") 
    public String getContent_type() { 
		 return this.content_type; } 
    public void setContent_type(String content_type) { 
		 this.content_type = content_type; } 
    String content_type;
    @JsonProperty("created_at") 
    public int getCreated_at() { 
		 return this.created_at; } 
    public void setCreated_at(int created_at) { 
		 this.created_at = created_at; } 
    int created_at;
    @JsonProperty("created_at_utc") 
    public int getCreated_at_utc() { 
		 return this.created_at_utc; } 
    public void setCreated_at_utc(int created_at_utc) { 
		 this.created_at_utc = created_at_utc; } 
    int created_at_utc;
    @JsonProperty("did_report_as_spam") 
    public boolean getDid_report_as_spam() { 
		 return this.did_report_as_spam; } 
    public void setDid_report_as_spam(boolean did_report_as_spam) { 
		 this.did_report_as_spam = did_report_as_spam; } 
    boolean did_report_as_spam;
    @JsonProperty("has_translation") 
    public boolean getHas_translation() { 
		 return this.has_translation; } 
    public void setHas_translation(boolean has_translation) { 
		 this.has_translation = has_translation; } 
    boolean has_translation;
    @JsonProperty("is_covered") 
    public boolean getIs_covered() { 
		 return this.is_covered; } 
    public void setIs_covered(boolean is_covered) { 
		 this.is_covered = is_covered; } 
    boolean is_covered;
    @JsonProperty("media_id") 
    public long getMedia_id() { 
		 return this.media_id; } 
    public void setMedia_id(long media_id) { 
		 this.media_id = media_id; } 
    long media_id;
    @JsonProperty("pk") 
    public long getPk() { 
		 return this.pk; } 
    public void setPk(long pk) { 
		 this.pk = pk; } 
    long pk;
    @JsonProperty("private_reply_status") 
    public int getPrivate_reply_status() { 
		 return this.private_reply_status; } 
    public void setPrivate_reply_status(int private_reply_status) { 
		 this.private_reply_status = private_reply_status; } 
    int private_reply_status;
    @JsonProperty("share_enabled") 
    public boolean getShare_enabled() { 
		 return this.share_enabled; } 
    public void setShare_enabled(boolean share_enabled) { 
		 this.share_enabled = share_enabled; } 
    boolean share_enabled;
    @JsonProperty("status") 
    public String getStatus() { 
		 return this.status; } 
    public void setStatus(String status) { 
		 this.status = status; } 
    String status;
    @JsonProperty("text") 
    public String getText() { 
		 return this.text; } 
    public void setText(String text) { 
		 this.text = text; } 
    String text;
    @JsonProperty("type") 
    public int getType() { 
		 return this.type; } 
    public void setType(int type) { 
		 this.type = type; } 
    int type;
    @JsonProperty("user") 
    public User getUser() { 
		 return this.user; } 
    public void setUser(User user) { 
		 this.user = user; } 
    User user;
    @JsonProperty("user_id") 
    public long getUser_id() { 
		 return this.user_id; } 
    public void setUser_id(long user_id) { 
		 this.user_id = user_id; } 
    long user_id;
}

class AudioReattributionInfo{
    @JsonProperty("should_allow_restore") 
    public boolean getShould_allow_restore() { 
		 return this.should_allow_restore; } 
    public void setShould_allow_restore(boolean should_allow_restore) { 
		 this.should_allow_restore = should_allow_restore; } 
    boolean should_allow_restore;
}

class AdditionalAudioInfo{
    @JsonProperty("additional_audio_username") 
    public Object getAdditional_audio_username() { 
		 return this.additional_audio_username; } 
    public void setAdditional_audio_username(Object additional_audio_username) { 
		 this.additional_audio_username = additional_audio_username; } 
    Object additional_audio_username;
    @JsonProperty("audio_reattribution_info") 
    public AudioReattributionInfo getAudio_reattribution_info() { 
		 return this.audio_reattribution_info; } 
    public void setAudio_reattribution_info(AudioReattributionInfo audio_reattribution_info) { 
		 this.audio_reattribution_info = audio_reattribution_info; } 
    AudioReattributionInfo audio_reattribution_info;
}

class BrandedContentTagInfo{
    @JsonProperty("can_add_tag") 
    public boolean getCan_add_tag() { 
		 return this.can_add_tag; } 
    public void setCan_add_tag(boolean can_add_tag) { 
		 this.can_add_tag = can_add_tag; } 
    boolean can_add_tag;
}

class MashupInfo{
    @JsonProperty("can_toggle_mashups_allowed") 
    public boolean getCan_toggle_mashups_allowed() { 
		 return this.can_toggle_mashups_allowed; } 
    public void setCan_toggle_mashups_allowed(boolean can_toggle_mashups_allowed) { 
		 this.can_toggle_mashups_allowed = can_toggle_mashups_allowed; } 
    boolean can_toggle_mashups_allowed;
    @JsonProperty("formatted_mashups_count") 
    public Object getFormatted_mashups_count() { 
		 return this.formatted_mashups_count; } 
    public void setFormatted_mashups_count(Object formatted_mashups_count) { 
		 this.formatted_mashups_count = formatted_mashups_count; } 
    Object formatted_mashups_count;
    @JsonProperty("has_been_mashed_up") 
    public boolean getHas_been_mashed_up() { 
		 return this.has_been_mashed_up; } 
    public void setHas_been_mashed_up(boolean has_been_mashed_up) { 
		 this.has_been_mashed_up = has_been_mashed_up; } 
    boolean has_been_mashed_up;
    @JsonProperty("mashups_allowed") 
    public boolean getMashups_allowed() { 
		 return this.mashups_allowed; } 
    public void setMashups_allowed(boolean mashups_allowed) { 
		 this.mashups_allowed = mashups_allowed; } 
    boolean mashups_allowed;
    @JsonProperty("original_media") 
    public Object getOriginal_media() { 
		 return this.original_media; } 
    public void setOriginal_media(Object original_media) { 
		 this.original_media = original_media; } 
    Object original_media;
}

class MusicAssetInfo{
    @JsonProperty("allows_saving") 
    public boolean getAllows_saving() { 
		 return this.allows_saving; } 
    public void setAllows_saving(boolean allows_saving) { 
		 this.allows_saving = allows_saving; } 
    boolean allows_saving;
    @JsonProperty("audio_asset_id") 
    public String getAudio_asset_id() { 
		 return this.audio_asset_id; } 
    public void setAudio_asset_id(String audio_asset_id) { 
		 this.audio_asset_id = audio_asset_id; } 
    String audio_asset_id;
    @JsonProperty("audio_cluster_id") 
    public String getAudio_cluster_id() { 
		 return this.audio_cluster_id; } 
    public void setAudio_cluster_id(String audio_cluster_id) { 
		 this.audio_cluster_id = audio_cluster_id; } 
    String audio_cluster_id;
    @JsonProperty("cover_artwork_thumbnail_uri") 
    public String getCover_artwork_thumbnail_uri() { 
		 return this.cover_artwork_thumbnail_uri; } 
    public void setCover_artwork_thumbnail_uri(String cover_artwork_thumbnail_uri) { 
		 this.cover_artwork_thumbnail_uri = cover_artwork_thumbnail_uri; } 
    String cover_artwork_thumbnail_uri;
    @JsonProperty("cover_artwork_uri") 
    public String getCover_artwork_uri() { 
		 return this.cover_artwork_uri; } 
    public void setCover_artwork_uri(String cover_artwork_uri) { 
		 this.cover_artwork_uri = cover_artwork_uri; } 
    String cover_artwork_uri;
    @JsonProperty("dark_message") 
    public Object getDark_message() { 
		 return this.dark_message; } 
    public void setDark_message(Object dark_message) { 
		 this.dark_message = dark_message; } 
    Object dark_message;
    @JsonProperty("dash_manifest") 
    public Object getDash_manifest() { 
		 return this.dash_manifest; } 
    public void setDash_manifest(Object dash_manifest) { 
		 this.dash_manifest = dash_manifest; } 
    Object dash_manifest;
    @JsonProperty("display_artist") 
    public String getDisplay_artist() { 
		 return this.display_artist; } 
    public void setDisplay_artist(String display_artist) { 
		 this.display_artist = display_artist; } 
    String display_artist;
    @JsonProperty("duration_in_ms") 
    public int getDuration_in_ms() { 
		 return this.duration_in_ms; } 
    public void setDuration_in_ms(int duration_in_ms) { 
		 this.duration_in_ms = duration_in_ms; } 
    int duration_in_ms;
    @JsonProperty("has_lyrics") 
    public boolean getHas_lyrics() { 
		 return this.has_lyrics; } 
    public void setHas_lyrics(boolean has_lyrics) { 
		 this.has_lyrics = has_lyrics; } 
    boolean has_lyrics;
    @JsonProperty("highlight_start_times_in_ms") 
    public List<Integer> getHighlight_start_times_in_ms() { 
		 return this.highlight_start_times_in_ms; } 
    public void setHighlight_start_times_in_ms(List<Integer> highlight_start_times_in_ms) { 
		 this.highlight_start_times_in_ms = highlight_start_times_in_ms; } 
    List<Integer> highlight_start_times_in_ms;
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("is_explicit") 
    public boolean getIs_explicit() { 
		 return this.is_explicit; } 
    public void setIs_explicit(boolean is_explicit) { 
		 this.is_explicit = is_explicit; } 
    boolean is_explicit;
    @JsonProperty("progressive_download_url") 
    public String getProgressive_download_url() { 
		 return this.progressive_download_url; } 
    public void setProgressive_download_url(String progressive_download_url) { 
		 this.progressive_download_url = progressive_download_url; } 
    String progressive_download_url;
    @JsonProperty("reactive_audio_download_url") 
    public Object getReactive_audio_download_url() { 
		 return this.reactive_audio_download_url; } 
    public void setReactive_audio_download_url(Object reactive_audio_download_url) { 
		 this.reactive_audio_download_url = reactive_audio_download_url; } 
    Object reactive_audio_download_url;
    @JsonProperty("subtitle") 
    public String getSubtitle() { 
		 return this.subtitle; } 
    public void setSubtitle(String subtitle) { 
		 this.subtitle = subtitle; } 
    String subtitle;
    @JsonProperty("title") 
    public String getTitle() { 
		 return this.title; } 
    public void setTitle(String title) { 
		 this.title = title; } 
    String title;
}

class IgArtist{
    @JsonProperty("follow_friction_type") 
    public int getFollow_friction_type() { 
		 return this.follow_friction_type; } 
    public void setFollow_friction_type(int follow_friction_type) { 
		 this.follow_friction_type = follow_friction_type; } 
    int follow_friction_type;
    @JsonProperty("full_name") 
    public String getFull_name() { 
		 return this.full_name; } 
    public void setFull_name(String full_name) { 
		 this.full_name = full_name; } 
    String full_name;
    @JsonProperty("is_private") 
    public boolean getIs_private() { 
		 return this.is_private; } 
    public void setIs_private(boolean is_private) { 
		 this.is_private = is_private; } 
    boolean is_private;
    @JsonProperty("is_verified") 
    public boolean getIs_verified() { 
		 return this.is_verified; } 
    public void setIs_verified(boolean is_verified) { 
		 this.is_verified = is_verified; } 
    boolean is_verified;
    @JsonProperty("pk") 
    public long getPk() { 
		 return this.pk; } 
    public void setPk(long pk) { 
		 this.pk = pk; } 
    long pk;
    @JsonProperty("profile_pic_id") 
    public String getProfile_pic_id() { 
		 return this.profile_pic_id; } 
    public void setProfile_pic_id(String profile_pic_id) { 
		 this.profile_pic_id = profile_pic_id; } 
    String profile_pic_id;
    @JsonProperty("profile_pic_url") 
    public String getProfile_pic_url() { 
		 return this.profile_pic_url; } 
    public void setProfile_pic_url(String profile_pic_url) { 
		 this.profile_pic_url = profile_pic_url; } 
    String profile_pic_url;
    @JsonProperty("username") 
    public String getUsername() { 
		 return this.username; } 
    public void setUsername(String username) { 
		 this.username = username; } 
    String username;
}

class MusicConsumptionInfo{
    @JsonProperty("allow_media_creation_with_music") 
    public boolean getAllow_media_creation_with_music() { 
		 return this.allow_media_creation_with_music; } 
    public void setAllow_media_creation_with_music(boolean allow_media_creation_with_music) { 
		 this.allow_media_creation_with_music = allow_media_creation_with_music; } 
    boolean allow_media_creation_with_music;
    @JsonProperty("audio_asset_start_time_in_ms") 
    public int getAudio_asset_start_time_in_ms() { 
		 return this.audio_asset_start_time_in_ms; } 
    public void setAudio_asset_start_time_in_ms(int audio_asset_start_time_in_ms) { 
		 this.audio_asset_start_time_in_ms = audio_asset_start_time_in_ms; } 
    int audio_asset_start_time_in_ms;
    @JsonProperty("formatted_clips_media_count") 
    public Object getFormatted_clips_media_count() { 
		 return this.formatted_clips_media_count; } 
    public void setFormatted_clips_media_count(Object formatted_clips_media_count) { 
		 this.formatted_clips_media_count = formatted_clips_media_count; } 
    Object formatted_clips_media_count;
    @JsonProperty("ig_artist") 
    public IgArtist getIg_artist() { 
		 return this.ig_artist; } 
    public void setIg_artist(IgArtist ig_artist) { 
		 this.ig_artist = ig_artist; } 
    IgArtist ig_artist;
    @JsonProperty("is_bookmarked") 
    public boolean getIs_bookmarked() { 
		 return this.is_bookmarked; } 
    public void setIs_bookmarked(boolean is_bookmarked) { 
		 this.is_bookmarked = is_bookmarked; } 
    boolean is_bookmarked;
    @JsonProperty("is_trending_in_clips") 
    public boolean getIs_trending_in_clips() { 
		 return this.is_trending_in_clips; } 
    public void setIs_trending_in_clips(boolean is_trending_in_clips) { 
		 this.is_trending_in_clips = is_trending_in_clips; } 
    boolean is_trending_in_clips;
    @JsonProperty("overlap_duration_in_ms") 
    public int getOverlap_duration_in_ms() { 
		 return this.overlap_duration_in_ms; } 
    public void setOverlap_duration_in_ms(int overlap_duration_in_ms) { 
		 this.overlap_duration_in_ms = overlap_duration_in_ms; } 
    int overlap_duration_in_ms;
    @JsonProperty("placeholder_profile_pic_url") 
    public String getPlaceholder_profile_pic_url() { 
		 return this.placeholder_profile_pic_url; } 
    public void setPlaceholder_profile_pic_url(String placeholder_profile_pic_url) { 
		 this.placeholder_profile_pic_url = placeholder_profile_pic_url; } 
    String placeholder_profile_pic_url;
    @JsonProperty("should_mute_audio") 
    public boolean getShould_mute_audio() { 
		 return this.should_mute_audio; } 
    public void setShould_mute_audio(boolean should_mute_audio) { 
		 this.should_mute_audio = should_mute_audio; } 
    boolean should_mute_audio;
    @JsonProperty("should_mute_audio_reason") 
    public String getShould_mute_audio_reason() { 
		 return this.should_mute_audio_reason; } 
    public void setShould_mute_audio_reason(String should_mute_audio_reason) { 
		 this.should_mute_audio_reason = should_mute_audio_reason; } 
    String should_mute_audio_reason;
}

class MusicInfo{
    @JsonProperty("music_asset_info") 
    public MusicAssetInfo getMusic_asset_info() { 
		 return this.music_asset_info; } 
    public void setMusic_asset_info(MusicAssetInfo music_asset_info) { 
		 this.music_asset_info = music_asset_info; } 
    MusicAssetInfo music_asset_info;
    @JsonProperty("music_consumption_info") 
    public MusicConsumptionInfo getMusic_consumption_info() { 
		 return this.music_consumption_info; } 
    public void setMusic_consumption_info(MusicConsumptionInfo music_consumption_info) { 
		 this.music_consumption_info = music_consumption_info; } 
    MusicConsumptionInfo music_consumption_info;
    @JsonProperty("push_blocking_test") 
    public Object getPush_blocking_test() { 
		 return this.push_blocking_test; } 
    public void setPush_blocking_test(Object push_blocking_test) { 
		 this.push_blocking_test = push_blocking_test; } 
    Object push_blocking_test;
}

class ClipsMetadata{
    @JsonProperty("additional_audio_info") 
    public AdditionalAudioInfo getAdditional_audio_info() { 
		 return this.additional_audio_info; } 
    public void setAdditional_audio_info(AdditionalAudioInfo additional_audio_info) { 
		 this.additional_audio_info = additional_audio_info; } 
    AdditionalAudioInfo additional_audio_info;
    @JsonProperty("audio_type") 
    public String getAudio_type() { 
		 return this.audio_type; } 
    public void setAudio_type(String audio_type) { 
		 this.audio_type = audio_type; } 
    String audio_type;
    @JsonProperty("branded_content_tag_info") 
    public BrandedContentTagInfo getBranded_content_tag_info() { 
		 return this.branded_content_tag_info; } 
    public void setBranded_content_tag_info(BrandedContentTagInfo branded_content_tag_info) { 
		 this.branded_content_tag_info = branded_content_tag_info; } 
    BrandedContentTagInfo branded_content_tag_info;
    @JsonProperty("breaking_content_info") 
    public Object getBreaking_content_info() { 
		 return this.breaking_content_info; } 
    public void setBreaking_content_info(Object breaking_content_info) { 
		 this.breaking_content_info = breaking_content_info; } 
    Object breaking_content_info;
    @JsonProperty("featured_label") 
    public Object getFeatured_label() { 
		 return this.featured_label; } 
    public void setFeatured_label(Object featured_label) { 
		 this.featured_label = featured_label; } 
    Object featured_label;
    @JsonProperty("is_shared_to_fb") 
    public boolean getIs_shared_to_fb() { 
		 return this.is_shared_to_fb; } 
    public void setIs_shared_to_fb(boolean is_shared_to_fb) { 
		 this.is_shared_to_fb = is_shared_to_fb; } 
    boolean is_shared_to_fb;
    @JsonProperty("mashup_info") 
    public MashupInfo getMashup_info() { 
		 return this.mashup_info; } 
    public void setMashup_info(MashupInfo mashup_info) { 
		 this.mashup_info = mashup_info; } 
    MashupInfo mashup_info;
    @JsonProperty("music_canonical_id") 
    public String getMusic_canonical_id() { 
		 return this.music_canonical_id; } 
    public void setMusic_canonical_id(String music_canonical_id) { 
		 this.music_canonical_id = music_canonical_id; } 
    String music_canonical_id;
    @JsonProperty("music_info") 
    public MusicInfo getMusic_info() { 
		 return this.music_info; } 
    public void setMusic_info(MusicInfo music_info) { 
		 this.music_info = music_info; } 
    MusicInfo music_info;
    @JsonProperty("nux_info") 
    public Object getNux_info() { 
		 return this.nux_info; } 
    public void setNux_info(Object nux_info) { 
		 this.nux_info = nux_info; } 
    Object nux_info;
    @JsonProperty("original_sound_info") 
    public Object getOriginal_sound_info() { 
		 return this.original_sound_info; } 
    public void setOriginal_sound_info(Object original_sound_info) { 
		 this.original_sound_info = original_sound_info; } 
    Object original_sound_info;
    @JsonProperty("shopping_info") 
    public Object getShopping_info() { 
		 return this.shopping_info; } 
    public void setShopping_info(Object shopping_info) { 
		 this.shopping_info = shopping_info; } 
    Object shopping_info;
    @JsonProperty("viewer_interaction_settings") 
    public Object getViewer_interaction_settings() { 
		 return this.viewer_interaction_settings; } 
    public void setViewer_interaction_settings(Object viewer_interaction_settings) { 
		 this.viewer_interaction_settings = viewer_interaction_settings; } 
    Object viewer_interaction_settings;
}

class FacepileTopLiker{
    @JsonProperty("follow_friction_type") 
    public int getFollow_friction_type() { 
		 return this.follow_friction_type; } 
    public void setFollow_friction_type(int follow_friction_type) { 
		 this.follow_friction_type = follow_friction_type; } 
    int follow_friction_type;
    @JsonProperty("full_name") 
    public String getFull_name() { 
		 return this.full_name; } 
    public void setFull_name(String full_name) { 
		 this.full_name = full_name; } 
    String full_name;
    @JsonProperty("is_private") 
    public boolean getIs_private() { 
		 return this.is_private; } 
    public void setIs_private(boolean is_private) { 
		 this.is_private = is_private; } 
    boolean is_private;
    @JsonProperty("is_verified") 
    public boolean getIs_verified() { 
		 return this.is_verified; } 
    public void setIs_verified(boolean is_verified) { 
		 this.is_verified = is_verified; } 
    boolean is_verified;
    @JsonProperty("pk") 
    public int getPk() { 
		 return this.pk; } 
    public void setPk(int pk) { 
		 this.pk = pk; } 
    int pk;
    @JsonProperty("profile_pic_id") 
    public String getProfile_pic_id() { 
		 return this.profile_pic_id; } 
    public void setProfile_pic_id(String profile_pic_id) { 
		 this.profile_pic_id = profile_pic_id; } 
    String profile_pic_id;
    @JsonProperty("profile_pic_url") 
    public String getProfile_pic_url() { 
		 return this.profile_pic_url; } 
    public void setProfile_pic_url(String profile_pic_url) { 
		 this.profile_pic_url = profile_pic_url; } 
    String profile_pic_url;
    @JsonProperty("username") 
    public String getUsername() { 
		 return this.username; } 
    public void setUsername(String username) { 
		 this.username = username; } 
    String username;
}

class FirstFrame{
    @JsonProperty("height") 
    public int getHeight() { 
		 return this.height; } 
    public void setHeight(int height) { 
		 this.height = height; } 
    int height;
    @JsonProperty("scans_profile") 
    public String getScans_profile() { 
		 return this.scans_profile; } 
    public void setScans_profile(String scans_profile) { 
		 this.scans_profile = scans_profile; } 
    String scans_profile;
    @JsonProperty("url") 
    public String getUrl() { 
		 return this.url; } 
    public void setUrl(String url) { 
		 this.url = url; } 
    String url;
    @JsonProperty("width") 
    public int getWidth() { 
		 return this.width; } 
    public void setWidth(int width) { 
		 this.width = width; } 
    int width;
}

class IgtvFirstFrame{
    @JsonProperty("height") 
    public int getHeight() { 
		 return this.height; } 
    public void setHeight(int height) { 
		 this.height = height; } 
    int height;
    @JsonProperty("scans_profile") 
    public String getScans_profile() { 
		 return this.scans_profile; } 
    public void setScans_profile(String scans_profile) { 
		 this.scans_profile = scans_profile; } 
    String scans_profile;
    @JsonProperty("url") 
    public String getUrl() { 
		 return this.url; } 
    public void setUrl(String url) { 
		 this.url = url; } 
    String url;
    @JsonProperty("width") 
    public int getWidth() { 
		 return this.width; } 
    public void setWidth(int width) { 
		 this.width = width; } 
    int width;
}

class AdditionalCandidates{
    @JsonProperty("first_frame") 
    public FirstFrame getFirst_frame() { 
		 return this.first_frame; } 
    public void setFirst_frame(FirstFrame first_frame) { 
		 this.first_frame = first_frame; } 
    FirstFrame first_frame;
    @JsonProperty("igtv_first_frame") 
    public IgtvFirstFrame getIgtv_first_frame() { 
		 return this.igtv_first_frame; } 
    public void setIgtv_first_frame(IgtvFirstFrame igtv_first_frame) { 
		 this.igtv_first_frame = igtv_first_frame; } 
    IgtvFirstFrame igtv_first_frame;
}

class Candidate{
    @JsonProperty("height") 
    public int getHeight() { 
		 return this.height; } 
    public void setHeight(int height) { 
		 this.height = height; } 
    int height;
    @JsonProperty("scans_profile") 
    public String getScans_profile() { 
		 return this.scans_profile; } 
    public void setScans_profile(String scans_profile) { 
		 this.scans_profile = scans_profile; } 
    String scans_profile;
    @JsonProperty("url") 
    public String getUrl() { 
		 return this.url; } 
    public void setUrl(String url) { 
		 this.url = url; } 
    String url;
    @JsonProperty("width") 
    public int getWidth() { 
		 return this.width; } 
    public void setWidth(int width) { 
		 this.width = width; } 
    int width;
}

class ImageVersions2{
    @JsonProperty("additional_candidates") 
    public AdditionalCandidates getAdditional_candidates() { 
		 return this.additional_candidates; } 
    public void setAdditional_candidates(AdditionalCandidates additional_candidates) { 
		 this.additional_candidates = additional_candidates; } 
    AdditionalCandidates additional_candidates;
    @JsonProperty("candidates") 
    public List<Candidate> getCandidates() { 
		 return this.candidates; } 
    public void setCandidates(List<Candidate> candidates) { 
		 this.candidates = candidates; } 
    List<Candidate> candidates;
}

class LikerConfig{
    @JsonProperty("ads_display_mode") 
    public int getAds_display_mode() { 
		 return this.ads_display_mode; } 
    public void setAds_display_mode(int ads_display_mode) { 
		 this.ads_display_mode = ads_display_mode; } 
    int ads_display_mode;
    @JsonProperty("disable_liker_list_navigation") 
    public boolean getDisable_liker_list_navigation() { 
		 return this.disable_liker_list_navigation; } 
    public void setDisable_liker_list_navigation(boolean disable_liker_list_navigation) { 
		 this.disable_liker_list_navigation = disable_liker_list_navigation; } 
    boolean disable_liker_list_navigation;
    @JsonProperty("display_mode") 
    public int getDisplay_mode() { 
		 return this.display_mode; } 
    public void setDisplay_mode(int display_mode) { 
		 this.display_mode = display_mode; } 
    int display_mode;
    @JsonProperty("hide_view_count") 
    public boolean getHide_view_count() { 
		 return this.hide_view_count; } 
    public void setHide_view_count(boolean hide_view_count) { 
		 this.hide_view_count = hide_view_count; } 
    boolean hide_view_count;
    @JsonProperty("is_daisy") 
    public boolean getIs_daisy() { 
		 return this.is_daisy; } 
    public void setIs_daisy(boolean is_daisy) { 
		 this.is_daisy = is_daisy; } 
    boolean is_daisy;
    @JsonProperty("is_in_daisy_controls") 
    public boolean getIs_in_daisy_controls() { 
		 return this.is_in_daisy_controls; } 
    public void setIs_in_daisy_controls(boolean is_in_daisy_controls) { 
		 this.is_in_daisy_controls = is_in_daisy_controls; } 
    boolean is_in_daisy_controls;
    @JsonProperty("show_author_view_likes_button") 
    public boolean getShow_author_view_likes_button() { 
		 return this.show_author_view_likes_button; } 
    public void setShow_author_view_likes_button(boolean show_author_view_likes_button) { 
		 this.show_author_view_likes_button = show_author_view_likes_button; } 
    boolean show_author_view_likes_button;
    @JsonProperty("show_count_in_likers_list") 
    public boolean getShow_count_in_likers_list() { 
		 return this.show_count_in_likers_list; } 
    public void setShow_count_in_likers_list(boolean show_count_in_likers_list) { 
		 this.show_count_in_likers_list = show_count_in_likers_list; } 
    boolean show_count_in_likers_list;
    @JsonProperty("show_daisy_liker_list_header") 
    public boolean getShow_daisy_liker_list_header() { 
		 return this.show_daisy_liker_list_header; } 
    public void setShow_daisy_liker_list_header(boolean show_daisy_liker_list_header) { 
		 this.show_daisy_liker_list_header = show_daisy_liker_list_header; } 
    boolean show_daisy_liker_list_header;
    @JsonProperty("show_learn_more") 
    public boolean getShow_learn_more() { 
		 return this.show_learn_more; } 
    public void setShow_learn_more(boolean show_learn_more) { 
		 this.show_learn_more = show_learn_more; } 
    boolean show_learn_more;
    @JsonProperty("show_view_count_in_likers_list") 
    public boolean getShow_view_count_in_likers_list() { 
		 return this.show_view_count_in_likers_list; } 
    public void setShow_view_count_in_likers_list(boolean show_view_count_in_likers_list) { 
		 this.show_view_count_in_likers_list = show_view_count_in_likers_list; } 
    boolean show_view_count_in_likers_list;
}

class SharingFrictionInfo{
    @JsonProperty("bloks_app_url") 
    public Object getBloks_app_url() { 
		 return this.bloks_app_url; } 
    public void setBloks_app_url(Object bloks_app_url) { 
		 this.bloks_app_url = bloks_app_url; } 
    Object bloks_app_url;
    @JsonProperty("should_have_sharing_friction") 
    public boolean getShould_have_sharing_friction() { 
		 return this.should_have_sharing_friction; } 
    public void setShould_have_sharing_friction(boolean should_have_sharing_friction) { 
		 this.should_have_sharing_friction = should_have_sharing_friction; } 
    boolean should_have_sharing_friction;
}

class VideoVersion{
    @JsonProperty("height") 
    public int getHeight() { 
		 return this.height; } 
    public void setHeight(int height) { 
		 this.height = height; } 
    int height;
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("type") 
    public int getType() { 
		 return this.type; } 
    public void setType(int type) { 
		 this.type = type; } 
    int type;
    @JsonProperty("url") 
    public String getUrl() { 
		 return this.url; } 
    public void setUrl(String url) { 
		 this.url = url; } 
    String url;
    @JsonProperty("width") 
    public int getWidth() { 
		 return this.width; } 
    public void setWidth(int width) { 
		 this.width = width; } 
    int width;
}

class IphoneStruct{
    @JsonProperty("can_see_insights_as_brand") 
    public boolean getCan_see_insights_as_brand() { 
		 return this.can_see_insights_as_brand; } 
    public void setCan_see_insights_as_brand(boolean can_see_insights_as_brand) { 
		 this.can_see_insights_as_brand = can_see_insights_as_brand; } 
    boolean can_see_insights_as_brand;
    @JsonProperty("can_view_more_preview_comments") 
    public boolean getCan_view_more_preview_comments() { 
		 return this.can_view_more_preview_comments; } 
    public void setCan_view_more_preview_comments(boolean can_view_more_preview_comments) { 
		 this.can_view_more_preview_comments = can_view_more_preview_comments; } 
    boolean can_view_more_preview_comments;
    @JsonProperty("can_viewer_reshare") 
    public boolean getCan_viewer_reshare() { 
		 return this.can_viewer_reshare; } 
    public void setCan_viewer_reshare(boolean can_viewer_reshare) { 
		 this.can_viewer_reshare = can_viewer_reshare; } 
    boolean can_viewer_reshare;
    @JsonProperty("can_viewer_save") 
    public boolean getCan_viewer_save() { 
		 return this.can_viewer_save; } 
    public void setCan_viewer_save(boolean can_viewer_save) { 
		 this.can_viewer_save = can_viewer_save; } 
    boolean can_viewer_save;
    @JsonProperty("caption") 
    public Caption getCaption() { 
		 return this.caption; } 
    public void setCaption(Caption caption) { 
		 this.caption = caption; } 
    Caption caption;
    @JsonProperty("caption_is_edited") 
    public boolean getCaption_is_edited() { 
		 return this.caption_is_edited; } 
    public void setCaption_is_edited(boolean caption_is_edited) { 
		 this.caption_is_edited = caption_is_edited; } 
    boolean caption_is_edited;
    @JsonProperty("client_cache_key") 
    public String getClient_cache_key() { 
		 return this.client_cache_key; } 
    public void setClient_cache_key(String client_cache_key) { 
		 this.client_cache_key = client_cache_key; } 
    String client_cache_key;
    @JsonProperty("clips_metadata") 
    public ClipsMetadata getClips_metadata() { 
		 return this.clips_metadata; } 
    public void setClips_metadata(ClipsMetadata clips_metadata) { 
		 this.clips_metadata = clips_metadata; } 
    ClipsMetadata clips_metadata;
    @JsonProperty("code") 
    public String getCode() { 
		 return this.code; } 
    public void setCode(String code) { 
		 this.code = code; } 
    String code;
    @JsonProperty("comment_count") 
    public int getComment_count() { 
		 return this.comment_count; } 
    public void setComment_count(int comment_count) { 
		 this.comment_count = comment_count; } 
    int comment_count;
    @JsonProperty("comment_likes_enabled") 
    public boolean getComment_likes_enabled() { 
		 return this.comment_likes_enabled; } 
    public void setComment_likes_enabled(boolean comment_likes_enabled) { 
		 this.comment_likes_enabled = comment_likes_enabled; } 
    boolean comment_likes_enabled;
    @JsonProperty("comment_threading_enabled") 
    public boolean getComment_threading_enabled() { 
		 return this.comment_threading_enabled; } 
    public void setComment_threading_enabled(boolean comment_threading_enabled) { 
		 this.comment_threading_enabled = comment_threading_enabled; } 
    boolean comment_threading_enabled;
    @JsonProperty("commerciality_status") 
    public String getCommerciality_status() { 
		 return this.commerciality_status; } 
    public void setCommerciality_status(String commerciality_status) { 
		 this.commerciality_status = commerciality_status; } 
    String commerciality_status;
    @JsonProperty("deleted_reason") 
    public int getDeleted_reason() { 
		 return this.deleted_reason; } 
    public void setDeleted_reason(int deleted_reason) { 
		 this.deleted_reason = deleted_reason; } 
    int deleted_reason;
    @JsonProperty("device_timestamp") 
    public long getDevice_timestamp() { 
		 return this.device_timestamp; } 
    public void setDevice_timestamp(long device_timestamp) { 
		 this.device_timestamp = device_timestamp; } 
    long device_timestamp;
    @JsonProperty("facepile_top_likers") 
    public List<FacepileTopLiker> getFacepile_top_likers() { 
		 return this.facepile_top_likers; } 
    public void setFacepile_top_likers(List<FacepileTopLiker> facepile_top_likers) { 
		 this.facepile_top_likers = facepile_top_likers; } 
    List<FacepileTopLiker> facepile_top_likers;
    @JsonProperty("featured_products_cta") 
    public Object getFeatured_products_cta() { 
		 return this.featured_products_cta; } 
    public void setFeatured_products_cta(Object featured_products_cta) { 
		 this.featured_products_cta = featured_products_cta; } 
    Object featured_products_cta;
    @JsonProperty("filter_type") 
    public int getFilter_type() { 
		 return this.filter_type; } 
    public void setFilter_type(int filter_type) { 
		 this.filter_type = filter_type; } 
    int filter_type;
    @JsonProperty("has_audio") 
    public boolean getHas_audio() { 
		 return this.has_audio; } 
    public void setHas_audio(boolean has_audio) { 
		 this.has_audio = has_audio; } 
    boolean has_audio;
    @JsonProperty("has_liked") 
    public boolean getHas_liked() { 
		 return this.has_liked; } 
    public void setHas_liked(boolean has_liked) { 
		 this.has_liked = has_liked; } 
    boolean has_liked;
    @JsonProperty("has_more_comments") 
    public boolean getHas_more_comments() { 
		 return this.has_more_comments; } 
    public void setHas_more_comments(boolean has_more_comments) { 
		 this.has_more_comments = has_more_comments; } 
    boolean has_more_comments;
    @JsonProperty("has_viewer_saved") 
    public boolean getHas_viewer_saved() { 
		 return this.has_viewer_saved; } 
    public void setHas_viewer_saved(boolean has_viewer_saved) { 
		 this.has_viewer_saved = has_viewer_saved; } 
    boolean has_viewer_saved;
    @JsonProperty("hide_view_all_comment_entrypoint") 
    public boolean getHide_view_all_comment_entrypoint() { 
		 return this.hide_view_all_comment_entrypoint; } 
    public void setHide_view_all_comment_entrypoint(boolean hide_view_all_comment_entrypoint) { 
		 this.hide_view_all_comment_entrypoint = hide_view_all_comment_entrypoint; } 
    boolean hide_view_all_comment_entrypoint;
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
    @JsonProperty("image_versions2") 
    public ImageVersions2 getImage_versions2() { 
		 return this.image_versions2; } 
    public void setImage_versions2(ImageVersions2 image_versions2) { 
		 this.image_versions2 = image_versions2; } 
    ImageVersions2 image_versions2;
    @JsonProperty("inline_composer_display_condition") 
    public String getInline_composer_display_condition() { 
		 return this.inline_composer_display_condition; } 
    public void setInline_composer_display_condition(String inline_composer_display_condition) { 
		 this.inline_composer_display_condition = inline_composer_display_condition; } 
    String inline_composer_display_condition;
    @JsonProperty("inline_composer_imp_trigger_time") 
    public int getInline_composer_imp_trigger_time() { 
		 return this.inline_composer_imp_trigger_time; } 
    public void setInline_composer_imp_trigger_time(int inline_composer_imp_trigger_time) { 
		 this.inline_composer_imp_trigger_time = inline_composer_imp_trigger_time; } 
    int inline_composer_imp_trigger_time;
    @JsonProperty("integrity_review_decision") 
    public String getIntegrity_review_decision() { 
		 return this.integrity_review_decision; } 
    public void setIntegrity_review_decision(String integrity_review_decision) { 
		 this.integrity_review_decision = integrity_review_decision; } 
    String integrity_review_decision;
    @JsonProperty("is_commercial") 
    public boolean getIs_commercial() { 
		 return this.is_commercial; } 
    public void setIs_commercial(boolean is_commercial) { 
		 this.is_commercial = is_commercial; } 
    boolean is_commercial;
    @JsonProperty("is_dash_eligible") 
    public int getIs_dash_eligible() { 
		 return this.is_dash_eligible; } 
    public void setIs_dash_eligible(int is_dash_eligible) { 
		 this.is_dash_eligible = is_dash_eligible; } 
    int is_dash_eligible;
    @JsonProperty("is_in_profile_grid") 
    public boolean getIs_in_profile_grid() { 
		 return this.is_in_profile_grid; } 
    public void setIs_in_profile_grid(boolean is_in_profile_grid) { 
		 this.is_in_profile_grid = is_in_profile_grid; } 
    boolean is_in_profile_grid;
    @JsonProperty("is_paid_partnership") 
    public boolean getIs_paid_partnership() { 
		 return this.is_paid_partnership; } 
    public void setIs_paid_partnership(boolean is_paid_partnership) { 
		 this.is_paid_partnership = is_paid_partnership; } 
    boolean is_paid_partnership;
    @JsonProperty("is_unified_video") 
    public boolean getIs_unified_video() { 
		 return this.is_unified_video; } 
    public void setIs_unified_video(boolean is_unified_video) { 
		 this.is_unified_video = is_unified_video; } 
    boolean is_unified_video;
    @JsonProperty("like_and_view_counts_disabled") 
    public boolean getLike_and_view_counts_disabled() { 
		 return this.like_and_view_counts_disabled; } 
    public void setLike_and_view_counts_disabled(boolean like_and_view_counts_disabled) { 
		 this.like_and_view_counts_disabled = like_and_view_counts_disabled; } 
    boolean like_and_view_counts_disabled;
    @JsonProperty("like_count") 
    public int getLike_count() { 
		 return this.like_count; } 
    public void setLike_count(int like_count) { 
		 this.like_count = like_count; } 
    int like_count;
    @JsonProperty("liker_config") 
    public LikerConfig getLiker_config() { 
		 return this.liker_config; } 
    public void setLiker_config(LikerConfig liker_config) { 
		 this.liker_config = liker_config; } 
    LikerConfig liker_config;
    @JsonProperty("max_num_visible_preview_comments") 
    public int getMax_num_visible_preview_comments() { 
		 return this.max_num_visible_preview_comments; } 
    public void setMax_num_visible_preview_comments(int max_num_visible_preview_comments) { 
		 this.max_num_visible_preview_comments = max_num_visible_preview_comments; } 
    int max_num_visible_preview_comments;
    @JsonProperty("media_type") 
    public int getMedia_type() { 
		 return this.media_type; } 
    public void setMedia_type(int media_type) { 
		 this.media_type = media_type; } 
    int media_type;
    @JsonProperty("number_of_qualities") 
    public int getNumber_of_qualities() { 
		 return this.number_of_qualities; } 
    public void setNumber_of_qualities(int number_of_qualities) { 
		 this.number_of_qualities = number_of_qualities; } 
    int number_of_qualities;
    @JsonProperty("organic_tracking_token") 
    public String getOrganic_tracking_token() { 
		 return this.organic_tracking_token; } 
    public void setOrganic_tracking_token(String organic_tracking_token) { 
		 this.organic_tracking_token = organic_tracking_token; } 
    String organic_tracking_token;
    @JsonProperty("original_height") 
    public int getOriginal_height() { 
		 return this.original_height; } 
    public void setOriginal_height(int original_height) { 
		 this.original_height = original_height; } 
    int original_height;
    @JsonProperty("original_width") 
    public int getOriginal_width() { 
		 return this.original_width; } 
    public void setOriginal_width(int original_width) { 
		 this.original_width = original_width; } 
    int original_width;
    @JsonProperty("photo_of_you") 
    public boolean getPhoto_of_you() { 
		 return this.photo_of_you; } 
    public void setPhoto_of_you(boolean photo_of_you) { 
		 this.photo_of_you = photo_of_you; } 
    boolean photo_of_you;
    @JsonProperty("pk") 
    public long getPk() { 
		 return this.pk; } 
    public void setPk(long pk) { 
		 this.pk = pk; } 
    long pk;
    @JsonProperty("play_count") 
    public int getPlay_count() { 
		 return this.play_count; } 
    public void setPlay_count(int play_count) { 
		 this.play_count = play_count; } 
    int play_count;
    @JsonProperty("preview_comments") 
    public List<Object> getPreview_comments() { 
		 return this.preview_comments; } 
    public void setPreview_comments(List<Object> preview_comments) { 
		 this.preview_comments = preview_comments; } 
    List<Object> preview_comments;
    @JsonProperty("product_type") 
    public String getProduct_type() { 
		 return this.product_type; } 
    public void setProduct_type(String product_type) { 
		 this.product_type = product_type; } 
    String product_type;
    @JsonProperty("profile_grid_control_enabled") 
    public boolean getProfile_grid_control_enabled() { 
		 return this.profile_grid_control_enabled; } 
    public void setProfile_grid_control_enabled(boolean profile_grid_control_enabled) { 
		 this.profile_grid_control_enabled = profile_grid_control_enabled; } 
    boolean profile_grid_control_enabled;
    @JsonProperty("saved_collection_ids") 
    public List<String> getSaved_collection_ids() { 
		 return this.saved_collection_ids; } 
    public void setSaved_collection_ids(List<String> saved_collection_ids) { 
		 this.saved_collection_ids = saved_collection_ids; } 
    List<String> saved_collection_ids;
    @JsonProperty("sharing_friction_info") 
    public SharingFrictionInfo getSharing_friction_info() { 
		 return this.sharing_friction_info; } 
    public void setSharing_friction_info(SharingFrictionInfo sharing_friction_info) { 
		 this.sharing_friction_info = sharing_friction_info; } 
    SharingFrictionInfo sharing_friction_info;
    @JsonProperty("taken_at") 
    public int getTaken_at() { 
		 return this.taken_at; } 
    public void setTaken_at(int taken_at) { 
		 this.taken_at = taken_at; } 
    int taken_at;
    @JsonProperty("top_likers") 
    public List<String> getTop_likers() { 
		 return this.top_likers; } 
    public void setTop_likers(List<String> top_likers) { 
		 this.top_likers = top_likers; } 
    List<String> top_likers;
    @JsonProperty("user") 
    public User getUser() { 
		 return this.user; } 
    public void setUser(User user) { 
		 this.user = user; } 
    User user;
    @JsonProperty("video_codec") 
    public String getVideo_codec() { 
		 return this.video_codec; } 
    public void setVideo_codec(String video_codec) { 
		 this.video_codec = video_codec; } 
    String video_codec;
    @JsonProperty("video_dash_manifest") 
    public String getVideo_dash_manifest() { 
		 return this.video_dash_manifest; } 
    public void setVideo_dash_manifest(String video_dash_manifest) { 
		 this.video_dash_manifest = video_dash_manifest; } 
    String video_dash_manifest;
    @JsonProperty("video_duration") 
    public double getVideo_duration() { 
		 return this.video_duration; } 
    public void setVideo_duration(double video_duration) { 
		 this.video_duration = video_duration; } 
    double video_duration;
    @JsonProperty("video_versions") 
    public List<VideoVersion> getVideo_versions() { 
		 return this.video_versions; } 
    public void setVideo_versions(List<VideoVersion> video_versions) { 
		 this.video_versions = video_versions; } 
    List<VideoVersion> video_versions;
    @JsonProperty("view_count") 
    public int getView_count() { 
		 return this.view_count; } 
    public void setView_count(int view_count) { 
		 this.view_count = view_count; } 
    int view_count;
}

class Owner{
    @JsonProperty("id") 
    public String getId() { 
		 return this.id; } 
    public void setId(String id) { 
		 this.id = id; } 
    String id;
}

public class GraphVideo{
    @JsonProperty("instaloader") 
    public Instaloader getInstaloader() { 
		 return this.instaloader; } 
    public void setInstaloader(Instaloader instaloader) { 
		 this.instaloader = instaloader; } 
    Instaloader instaloader;
    @JsonProperty("node") 
    public Node getNode() { 
		 return this.node; } 
    public void setNode(Node node) { 
		 this.node = node; } 
    Node node;
}

