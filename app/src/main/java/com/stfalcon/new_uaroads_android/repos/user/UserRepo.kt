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

package com.stfalcon.new_uaroads_android.repos.user

import com.stfalcon.new_uaroads_android.common.network.models.response.UserStatisticResponse
import io.reactivex.Single

/*
 * Created by Anton Bevza on 5/19/17.
 */
interface UserRepo {
    fun getUserStatistics(uid: String, email: String?): Single<UserStatisticResponse>
}