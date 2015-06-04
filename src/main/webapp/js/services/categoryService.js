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