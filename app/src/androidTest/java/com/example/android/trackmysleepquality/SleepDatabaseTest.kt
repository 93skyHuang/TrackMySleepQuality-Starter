/*
 * Copyright 2019, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.trackmysleepquality

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.android.trackmysleepquality.database.SleepDatabase
import com.example.android.trackmysleepquality.database.SleepDatabaseDao
import com.example.android.trackmysleepquality.database.SleepNight
import org.junit.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException


/**
 * This is not meant to be a full set of tests. For simplicity, most of your samples do not
 * include tests. However, when building the Room, it is helpful to make sure it works before
 * adding the UI.
 */

@RunWith(AndroidJUnit4::class)
class SleepDatabaseTest {

//    private lateinit var sleepDao: SleepDatabaseDao
//    private lateinit var db: SleepDatabase
//
//    @Before
//    fun createDb() {
//        val context = InstrumentationRegistry.getInstrumentation().targetContext
//        // Using an in-memory database because the information stored here disappears when the
//        // process is killed.
//        db = Room.inMemoryDatabaseBuilder(context, SleepDatabase::class.java)
//                // Allowing main thread queries, just for testing.
//                .allowMainThreadQueries()
//                .build()
//        sleepDao = db.sleepDatabaseDao
//    }
//
//    @After
//    @Throws(IOException::class)
//    fun closeDb() {
//        db.close()
//    }

//    @Test
//    @Throws(Exception::class)
//   suspend fun insertAndGetNight() {
//        val night = SleepNight(nightId = 1, sleepQuality = 1)
//        sleepDao.insert(night)
//        val tonight = sleepDao.getTonight()
//        assertEquals(tonight?.sleepQuality, 1)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    suspend fun getNightAndUpdate() {
//        val night = SleepNight(nightId = 1, sleepQuality = 1)
//        sleepDao.insert(night)
//        val tonight = sleepDao.get(1)
//        tonight?.let {
//            it.sleepQuality = 3
//            sleepDao.update(it)
//        }
//        assertEquals(tonight?.sleepQuality, 3)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    suspend  fun clear() {
//        val night = SleepNight(nightId = 1, sleepQuality = 1)
//        sleepDao.insert(night)
//        val tonight = sleepDao.get(1)
//        assertEquals(tonight?.sleepQuality, 1)
//        sleepDao.clear()
//        val tonight2 = sleepDao.get(1)
//        assertEquals(tonight2, null)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    suspend  fun delete() {
//        val night = SleepNight(nightId = 1, sleepQuality = 1)
//        sleepDao.insert(night)
//        val night2 = SleepNight(nightId = 2, sleepQuality = 1)
//        sleepDao.insert(night2)
//        val targetNight = sleepDao.get(2)
//        assertEquals(targetNight?.sleepQuality, 1)
//        if (targetNight is SleepNight) {
//            sleepDao.delete(targetNight)
//        }
//        val tonight2 = sleepDao.get(2)
//        assertEquals(tonight2, null)
//    }
//
//
//    @Test
//    @Throws(Exception::class)
//    suspend fun deletes() {
//        val night = SleepNight(nightId = 1, sleepQuality = 1)
//        sleepDao.insert(night)
//        val night2 = SleepNight(nightId = 2, sleepQuality = 1)
//        sleepDao.insert(night2)
//        var nights = arrayOf(night, night2)
//        assertEquals(nights.size, 2)
//        sleepDao.deletes(nights)
//        val tonight2 = sleepDao.get(2)
//        assertEquals(tonight2, null)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    suspend fun getAllNights() {
//        val night = SleepNight(nightId = 1, sleepQuality = 1)
//        sleepDao.insert(night)
//        val night2 = SleepNight(nightId = 2)
//        sleepDao.insert(night2)
//        val tonight = sleepDao.getAllNights()
//        assertEquals(tonight.size, 2)
//    }
//
//    @Test
//    @Throws(Exception::class)
//    suspend fun getAllNightsLiveData() {
//        val night = SleepNight(nightId = 1, sleepQuality = 1)
//        sleepDao.insert(night)
//        val night2 = SleepNight(nightId = 2)
//        sleepDao.insert(night2)
//        var l=sleepDao.getAllNightsLiveData()
//
//        assertEquals(  l.value?.size, 2)
//    }

}