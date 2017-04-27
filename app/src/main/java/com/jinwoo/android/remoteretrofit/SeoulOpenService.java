package com.jinwoo.android.remoteretrofit;

import com.jinwoo.android.remoteretrofit.domain.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by JINWOO on 2017-03-07.
 */

public interface SeoulOpenService {

    // full address - "http://openapi.seoul.go.kr:8088/417058676568616e3137534e56494f/json/SearchParkingInfoRealtime/1/10/";
        @GET("417058676568616e3137534e56494f/json/SearchParkingInfoRealtime/1/10/{gu}")
        Call<Data> getData(@Path("gu") String value);

}
