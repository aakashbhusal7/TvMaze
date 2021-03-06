package com.android.ashwiask.tvmaze.network;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

@GsonTypeAdapterFactory
public abstract class TvMazeTypeAdaptorFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory create() {
        return new AutoValueGson_TvMazeTypeAdaptorFactory();
    }
}
