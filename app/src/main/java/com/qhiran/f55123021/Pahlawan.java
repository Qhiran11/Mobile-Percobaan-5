package com.qhiran.f55123021;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Pahlawan implements Parcelable {
    private String name;
    private String description;
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public Integer getPhoto() {return photo;}
    public void setPhoto(Integer photo) {this.photo = photo;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    private Integer photo;

    @Override
    public int describeContents() {return 0;}
    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(this.name);dest.writeString(this.description);dest.writeInt(this.photo);}
    Pahlawan(){}
    private Pahlawan (Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.photo = in.readInt();}
    public static final Parcelable.Creator<Pahlawan> CREATOR =
            new Parcelable.Creator<Pahlawan>() {
        @Override public Pahlawan createFromParcel (Parcel source) {return new Pahlawan (source);}
        @Override public Pahlawan [] newArray (int size) {return new Pahlawan[size];}
    };
}
