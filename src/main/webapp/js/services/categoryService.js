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

/**
 * Created by GiBSoN on 2015-06-04.
 */

app.service('categoryService', function($http, $q) {
    return({
        addCategory: addCategory,
        getCategories: getCategories
    });

    function addCategory( name ) {
        var request = $http({
            method: "post",
            url: "rest/categories/create",
            data: {
                name: name
            }
        });

        return( request.then( handleSuccess, handleError ) );
    }

    function getCategories() {

        var request = $http({
            method: "get",
            url: "rest/categories"
        });

        return( request.then( handleSuccess, handleError ) );
    }

    function handleError( response ) {
        return( $q.reject( response ) );
    }

    function handleSuccess( response ) {

        return( response.data );

    }
});