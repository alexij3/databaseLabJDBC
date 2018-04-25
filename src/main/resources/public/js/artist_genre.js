var app = angular.module("demo", []);

app.controller("ArtistGenreCtrl", function($scope, $http) {
    var artistId;
    var genres = [];

    $scope.artists = [];
    $http.get('/api/artistgenre/showgenres').then(function (response) {
        $scope.artists = response.data;
        startAddGenre(1, 'Бойчук Олег Станіславович');
        addGenre();
    });


    this.startAddGenre = function startAddGenre(id, name) {
        artistId = id;
        document.getElementById('labelArtist').innerHTML = name;
    };

    this.addGenre = function addGenre(){
        $http.get('/api/artist/get?id=' + artistId).then(function(response){
            var artistToGet;


            genres = $scope.selectedGenres;
            artistToGet = response.data;
            window.alert("in loop with artist " + artistToGet.name + " and genre " + genres[0]);
            var request = {
                method: 'PUT',
                url: '/api/artistgenre/insertgenre',
                data: {
                    artist: artistToGet,
                    genre: "Фантастика"
                }
            };
            $http(request).then(function (response) {
                window.alert(response);
            });
            window.alert(response.data.name);
        });

        genres = [];
        window.alert(response.data.name);
        echo("");
    }
});



