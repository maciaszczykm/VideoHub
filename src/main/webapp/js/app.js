var app = angular.module('VideoHubApp', []);

app.controller('mainCtrl', function($scope, $http) {
    $http.get('rest/greeting').success(function(data) {
        $scope.greeting = data;
    });
});