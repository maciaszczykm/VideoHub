/*
 * Copyright 2015 Sebastian Florek and Marcin Maciaszczyk
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

var app = angular.module('VideoHubApp', []);

app.controller('mainCtrl', function ($scope, $sce, categoryService) {

    $scope.categories = [];

    $scope.form = {
        name: ""
    };

    loadRemoteData();

    $scope.addCategory = function () {
        categoryService.addCategory($scope.form.name)
            .then(loadRemoteData, function (error) {
                $scope.authenticationError = error;
                $scope.authenticationError.data = $sce.trustAsHtml(error.data);
            });

        $scope.form.name = "";
    };

    function applyRemoteData(newCategories) {

        $scope.categories = newCategories;

    }


    // I load the remote data from the server.
    function loadRemoteData() {

        // The friendService returns a promise.
        categoryService.getCategories()
            .then(function (categories) {
                applyRemoteData(categories);
            }
        );
    }
});