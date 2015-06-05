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