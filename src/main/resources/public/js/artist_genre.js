var app = angular.module("demo", []);

app.controller("ArtistGenreCtrl", function($scope, $http){
    $scope.artists = [];
    $http.get('/api/artist/showall').then(function (response){
        $scope.artists=response.data;
        console.log(response);
    });
});



