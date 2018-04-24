var app = angular.module("demo", []);

app.controller("AppCtrl", function($scope, $http){

    $scope.artists = [];
     $http.get('/api/artist').then(function (response){
        $scope.artists=response.data;
        console.log(response);
    });

    $scope.artistsAndImpresarios = [];
    $http.get('/api/artistimpresario').then(function (response){
        $scope.artistsAndImpresarios=response.data;
        console.log(response);
    });

    $scope.cinemas = [];
    $http.get('/api/cinema').then(function (response){
        $scope.cinemas=response.data;
        console.log(response);
    });

    $scope.concertHalls = [];
    $http.get('/api/concerthall').then(function (response){
        $scope.concertHalls=response.data;
        console.log(response);
    });

    $scope.cinemaMovies = [];
    $http.get('/api/cinemamovie').then(function (response){
        $scope.cinemaMovies=response.data;
        console.log(response);
    });

    $scope.impresarios = [];
    $http.get('/api/impresario').then(function (response){
        $scope.impresarios=response.data;
        console.log(response);
    });

    $scope.culturePalaces = [];
    $http.get('/api/culturepalace').then(function (response){
        $scope.culturePalaces=response.data;
        console.log(response);
    });

    $scope.theatres = [];
    $http.get('/api/theatre').then(function (response){
        $scope.theatres=response.data;
        console.log(response);
    });

    $scope.concertsInHall = [];
    $http.get('/api/concertinhall').then(function (response){
        $scope.concertsInHall=response.data;
        console.log(response);
    });

    $scope.contestsInPalaces = [];
    $http.get('/api/contestinpalace').then(function (response){
        $scope.contestsInPalaces=response.data;
        console.log(response);
    });

    $scope.theatrePerformances = [];
    $http.get('/api/theatreperformance').then(function (response){
        $scope.theatrePerformances=response.data;
        console.log(response);
    });

    $scope.organizers = [];
    $http.get('/api/organizer').then(function (response){
        $scope.organizers=response.data;
        console.log(response);
    });

    $scope.contestResults = [];
    $http.get('/api/contestresults').then(function (response){
        $scope.contestResults=response.data;
        console.log(response);
    });
});

