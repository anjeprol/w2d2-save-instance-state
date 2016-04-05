package com.example.saveinstancetest;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by evin on 4/5/16.
 */
public class CustomObject implements Parcelable {
    private int age;
    private int height;

    public CustomObject() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    protected CustomObject(Parcel in) {
        age = in.readInt();
        height = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(age);
        dest.writeInt(height);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<CustomObject> CREATOR = new Parcelable.Creator<CustomObject>() {
        @Override
        public CustomObject createFromParcel(Parcel in) {
            return new CustomObject(in);
        }

        @Override
        public CustomObject[] newArray(int size) {
            return new CustomObject[size];
        }
    };
}