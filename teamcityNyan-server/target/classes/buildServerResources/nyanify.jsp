<%@ taglib prefix="intprop" uri="/WEB-INF/functions/intprop"
%><%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"
%><c:if test="${intprop:getBoolean('teamcity.ui.nyanify')}"><script>
    (function() {
        console.log('nyan-nyan');
        document.documentElement.className += ' nyan-nyan';
    })();
</script></c:if>