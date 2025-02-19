/*
 * Copyright 2018-2020 KunMinX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kunminx.puremusic.ui.state;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kunminx.puremusic.data.bean.Moment;
import com.kunminx.puremusic.domain.MomentRequest;

import java.util.List;

/**
 * Create by KunMinX at 2020/5/30
 */
public class ListViewModel extends ViewModel {

    public final MutableLiveData<List<Moment>> list = new MutableLiveData<>();

    public final MutableLiveData<Boolean> autoScrollToTopWhenInsert = new MutableLiveData<>();

    public final MomentRequest momentRequest = new MomentRequest();

    {
        autoScrollToTopWhenInsert.setValue(true);
    }

}
