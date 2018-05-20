var app = angular.module('myApp', ['ui.router']);
app.controller('myCtrl', function ($scope, $state) {
    var a =123;
    $state.go("field");
});

app.config(function ($stateProvider, $urlRouterProvider) {
    //$urlRouterProvider.otherwise('/field');
    $stateProvider
        .state('field',{
        url: '/field',
        views: {
            '': {
                templateUrl: 'partials/field/field.html',
                controller: FieldCtrl
            }
        }
    }).state('field_detail',{
        url: '/field/detail',
        views: {
            '': {
                templateUrl: 'partials/field/field_detail.html',
                controller: FieldDetailCtrl
            }
        }
    }).state('entrepot',{
        url: '/entrepot',
        views: {
            '': {
                templateUrl: 'partials/entrepot/entrepot.html',
                controller: EntrepotCtrl
            }
        }
    }).state('entrepot_detail',{
        url: '/entrepot/detail',
        views: {
            '': {
                templateUrl: 'partials/entrepot/entrepot_detail.html',
                controller: EntrepotDetailCtrl
            }
        }
    }).state('process',{
        url: '/process',
        views: {
            '': {
                templateUrl: 'partials/process/process.html',
                controller: ProcessCtrl
            }
        }
    }).state('franchiser',{
        url: '/franchiser',
        views: {
            '': {
                templateUrl: 'partials/franchiser/franchiser.html',
                controller: FranchiserCtrl
            }
        }
    })

});