function EntrepotCtrl($scope) {


    $scope.enterDetail = function (content) {
        sessionStorage.setItem('entrepot', JSON.stringify(content));
        // console.log(sessionStorage.getItem('entrepot'));
    };

    var init = function () {

    };

    init();
}

function EntrepotDetailCtrl($scope, $http, $window) {
    $scope.entrepot = FieldService.get('entrepot');

    $scope.totalPages = 0;
    $scope.pageNum = 1;
    $scope.contents = [];

    $scope.pg1 = 0;
    $scope.pg2 = 0;
    $scope.pg3 = 0;
    $scope.pg4 = 0;
    $scope.pg5 = 0;

    var findbypage = function () {
        $http({
            url: "field/findbypage",
            method: "get",
            params: {
                pageNum: 0
            }
        }).success(function (res) {
            $scope.contents = res.content;
            // console.log($scope.contents);
            $scope.totalPages = res.totalPages;
            $scope.pageNum = parseInt(res.number) + 1;
            if($scope.totalPages > 0){
                $scope.turnToPage($scope.pageNum);
            }
        });
    };

    $scope.turnToPage = function (num) {
        num = parseInt(num);
        if(num < 1 || num > $scope.totalPages)
            return;
        $scope.pageNum = num;
        for(var i = 0;i < 2; i++){
            var cur1 = num - i - 1;
            if(cur1 > 0){
                $scope["pg" + (2 - i)] = cur1;
            }else{
                $scope["pg" + (2 - i)] = 0;
            }
        }
        for(var j = 0;j < 2; j++){
            var cur2 = num + j + 1;
            if(cur2 <= $scope.totalPages){
                $scope["pg" + (j + 4)] = cur2;
            }else{
                $scope["pg" + (j + 4)] = 0;
            }
        }
        $scope["pg3"] = num;
    };

    $scope.enterDetail = function (content) {
        sessionStorage.setItem('field', JSON.stringify(content));
        // console.log(sessionStorage.getItem('field'));
    };

    $scope.goback = function () {
        $window.history.back();
    };

    var init = function () {
        findbypage();
    };

    init();
}