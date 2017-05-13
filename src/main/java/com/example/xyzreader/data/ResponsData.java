package com.example.xyzreader.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Amr on 5/3/2017.
 */

public class ResponsData implements Parcelable {
    private String name_of_project;
    private String description;
    private String developer_name;
    private String github_link;
    private String photo;

    protected ResponsData(Parcel in) {
        name_of_project = in.readString();
        description = in.readString();
        developer_name = in.readString();
        github_link = in.readString();
        photo = in.readString();
    }

    public static final Creator<ResponsData> CREATOR = new Creator<ResponsData>() {
        @Override
        public ResponsData createFromParcel(Parcel in) {
            return new ResponsData(in);
        }

        @Override
        public ResponsData[] newArray(int size) {
            return new ResponsData[size];
        }
    };

    public ResponsData() {
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName_of_project() {
        return name_of_project;
    }

    public void setName_of_project(String name_of_project) {
        this.name_of_project = name_of_project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper_name() {
        return developer_name;
    }

    public void setDeveloper_name(String developer_name) {
        this.developer_name = developer_name;
    }

    public String getGithub_link() {
        return github_link;
    }

    public void setGithub_link(String github_link) {
        this.github_link = github_link;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name_of_project);
        dest.writeString(description);
        dest.writeString(developer_name);
        dest.writeString(github_link);
        dest.writeString(photo);
    }
}
