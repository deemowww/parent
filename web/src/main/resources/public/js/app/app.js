var app = angular.module('myApp', ['ui.router']);
app.controller('myCtrl', function ($scope) {
    var a =123;
});
app.config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/field');
    $stateProvider
        .state('field',{
        url: '/field',
        views: {
            '': {
                templateUrl: 'partials/field/field.html',
                controller: FieldCtrl
            }
        }
    })
        .state('field_detail',{
            url: '/field/detail',
            views: {
                '': {
                    templateUrl: 'partials/field/field_detail.html',
                    controller: FieldDetailCtrl
                }
            }
        })
});