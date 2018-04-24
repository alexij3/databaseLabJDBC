var app = angular.module("demo", []);

app.controller("ImpresarioCtrl", function($scope, $http){

    var idToUpdate;

    $scope.impresarios = [];
     $http.get('/api/impresario/showAll').then(function (response){
        $scope.impresarios=response.data;
        console.log(response);
    });

    this.deleteImpresario = function deleteImpresario(id){
        $http.get('/api/impresario/delete?id=' + id).then(function(){
            window.location.reload();
            console.log("deleted impresario with id " + id);
        });
    };

    this.createImpresario = function createImpresario(){
        var name = document.getElementById('impresarioName').value;
        $http.get('/api/impresario/create?name=' + name).success(
            console.log('created impresario with name ' + name)
        ).then(function(){
            window.parent.location.reload();
        });
    };

    this.startUpdateImpresario = function startUpdateImpresario(id){
        idToUpdate = id;
    };

    this.updateImpresario = function updateImpresario(){
        var name = document.getElementById('updateImpresarioName').value;
        var request = {
            method: 'POST',
            url : '/api/impresario/update?id=' + idToUpdate,
            data: {
                name : name
            }
        };

        $http(request).then(function (response){
            console.log(response);
        })
    }
});



