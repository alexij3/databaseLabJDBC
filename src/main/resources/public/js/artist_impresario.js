var app = angular.module("demo", []);

app.controller("ArtistImpresarioCtrl", function($scope, $http) {
    $scope.artists = [];
    $http.get('/api/artistimpresario/showall').then(function(response){
       $scope.artists = response.data;
    });

    $http.get('/api/impresario/showAll').then(function(response) {
        var impresarios = response.data;
        var select = document.getElementById('selectImpresarios');

        for (var i = 0; i < impresarios.length; i++) {
            var option = document.createElement("option");
            option.text = impresarios[i].name;
            option.value = impresarios[i].id;

            select.add(option);

            console.log(select);
        }
    });

    this.startAddImpresario = function startAddImpresario(id, name){
        document.getElementById('labelArtistName').innerHTML = name;
    }
});