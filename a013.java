
import java.util.Scanner;
public class a013 {
	public static void main(String[] args){
		Scanner in=new Scanner("3710728753390210279879799822083759024651013574025046376937677490009712648124896970078050417018260538743249861995247410594742333095130581237266173096299194221336357416157252243056330181107240615490825023067588207539346171171980310421047513778063246676892616706966236338201363784183836841787343617267572811287981284997940806548193159262169127588983273844274228917432520321923589422876796487670272189318474514457360013064390911672168568445887116031532767038648610584302543993961982891759366568675793495162176457141856560629502157223196586755079324193331649063524627419049291014324458138226633479447581789257586771833721766196375159057923972824559883840758203565325359399008402633568948830189458628227828801811993848262820142781941399405675871511700943903539866437282711265382998724078447305319010429358686515506006295864861532075273371959191420517255829716938887077154664991155934876035329217149700569385437007057682668462462149565007647178729443837760453282654108756828443191190634694037855217779295145361232725250002960710750825638156567108852583507214587657617241097644733911060721826523687722363604517423706905851860660448207621209813287860733969412811426604180868306193284608111910615569405126896925193432545172838864191804704929321505864256304948362467221648435076201727918039944693004732956340691157324443869081257945140890577062294291971079282095503768752567877309186254074496984450833039368212618336384825330154686196124348767681297534375946515803862875928784902015216855548287172012192577669547818283375799310361474035685644909552709786479758116726320100436897842553539920931837441497806860984484030981290777917990882187953273644756755908480308708698755139271185451707854416185242432069315033259959406895756536782107074926966537676326235447210697939506796526947425977097391666937630426339870854105268470829908521139942736573411618276031500127165378607361501080857009149939512557028198746004375358290353174347173269321235781549826297425527373079495375976510530594696606768315657437716740187527588902802571733229619176668713819931811048770190271252676802760780030136786809925254634010616328665263627021854049770558562994658063623799314074625" +
				"5962240744869082311749777923654662572469233228109171419143028819710328859780666976089293863828502533340334413065578016127815921815005561868836468420090470230530811728164304876237919698424872550366387845831148769693215490281042402013833512446218144177347063783299490636259666498587618221225225512486764533677201869716985443124195724099139590089523100588229554825530026352078153229679624948164195386821877476085327132285723110424803456124867697064507995236377742425354112916842768655389262050249103265729672370191327572567528565324825826546309220705859652229798860272258331913126375147341994889534765745501184957014548792889848568277260777137214037988797153829820378303147352772158034814451349137322665138134829543829199918180278916522431027392251122869539409579530664052326325380441000596549391598795936352974615218550237130764225512118369380358038858490341698116222072977186158236678424689157993532961922624679571944012690438771072750481023908955235974572318970677254791506150550495392297953090112996751986188088225875314529584099251203829009407770775672113067397083047244838165338735023408456470580773088295917476714036319800818712901187549131054712658197623331044818386269515456334926366572897563400500428462801835170705278318394258821455212272512503275512160354698120058176216521282765275169129689778932238195734329339946437501907836945765883352399886755061649651847751807381688378610915273579297013376217784275219262340194239963916804498399317331273132924185707147349566916674687634660915035914677504995186714302352196288948901024233251169136196266227326746080059154747183079839286853520694694454072476841822524674417161514036427982273348055556214818971426179103425986472045168939894221798260880768528778364618279934631376775430780936333301898264209010848802521674670883215120185883543223812876952786713296124747824645386369930090493103636197638780396218407357239979422340623539380833965132740801111666627891981488087797941876876144230030984490851411606618262936828367647447792391803351109890697907148578694408955299065364044742557608365997664579509666024396409905389607120198219976047599490197230297649139826800329731560371200413779037855660850892521673093931987275027546890690370753941304265231501194809377245048795150954100921645863754710598436791786391670211874924319957006419179697775990283006991536871371193661495281130587638027841075444973307840789923115535562561142322423255033685442488917353448899115014406480203690680639606723221932041495354150312888033953605329934036800697771065056663195481234880673210146739058568557934581403627822703280826165707739483275922328459417065250945123252306082291880205877731971983945018088807242966198081119777158542502016545090413245809786882778948721859617721078384350691861554356628840622574736922845095162084960398013400172393067166682355524525280460972253503534226472524250874054075591789781264330331690").useDelimiter("\\s*");
		byte a[][]=new byte[100][50];
		int f[]=new int[50];
		int r=0;
		for(byte t1=0;t1<100;t1++){
			for(byte t2=49;t2>=0;t2--){
				a[t1][t2]=in.nextByte();
			}
		}
		for(byte t2=0;t2<50;t2++){
			f[t2]+=r;
			r=0;
			for(byte t1=0;t1<100;t1++){
				f[t2]+=a[t1][t2];
			}
			r=f[t2]/10;
			f[t2]=f[t2]%10;
		}
		System.out.print(r);
		for(byte t=49;t>=0;t--){
			System.out.print(f[t]);
		}
	}
}
