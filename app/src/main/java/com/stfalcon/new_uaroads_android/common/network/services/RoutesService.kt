/*
 * Copyright (c) 2017 stfalcon.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.stfalcon.new_uaroads_android.common.network.services

import com.stfalcon.new_uaroads_android.common.network.models.LatLng
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

/*
 * Created by Anton Bevza on 4/14/17.
 */
interface RoutesService {

    @GET("http://route.uaroads.com/viaroute?output=json&instructions=true&alt=false")
    fun getRouteInstructions(@Query("loc") locations: List<LatLng>): Single<String>
}