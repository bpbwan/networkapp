�}�L  �   eؒ����u
��7֛�,x(˦ݻ_фJ�H����qmI4�^�ڧ��B5W��4�S�� �NΨ5v�x�㲀�)�l��>M��c=Q��^@}��*��^�.��wk��9�ԑ��b:�^�Ӑ�L���P:p**(VP-)`h��I�e�S<�c ��[�x�A��ߌð�;b}kB�JU5(D�z<*tS�D�-Y����IYv~�W:��vo����	��=N7r�᧰�!M=G?�x��h�X��~#���k���#nOa��m�"(� ���R���a8�ϒ��[�w3�pZ�6Y=��J��ƍ�N5�/#�@vC�^���<U)�����0���o=`S|�õT�!��������"z!LA��`��+��?wp�c��RR�}s��褔}��DH��ގ��ƨĮ���s����t̲؍O����]��t7�z2ۈ��[��??�MJ�odS���'�q�	!8�ʋyZ��X�l�*��L7qL��9��uarڐI�
i�Kb!���Ѓ��̏�_Z�g4�`"��MN����%��r7K�W&�]%�Ռ��J�_dCx�c�T��X�nگ]����~��n�];P g�u��T���S�*�y	��Ⱥ�Da�V"�IJ%e�ma�H��@���/��]�!����v�P�Y^��)�k}s�D؊`�e5�}
ݐ�
x����Oz�]Cdx�Y#��ٍ:��Ua�I�D���h��3���Ҩ}�m[dh����U���JCq��	�>_�_��D9Z@'b1]�{ �>gP�[���:�C�|�^�-�� &�^c0�(5-��.\���֫�<RGV��+N/p���K3������ʔD�����ܚ��C�ͣ�m���tz�ʒ������_"-A�y�E��Ă�K�lҿK�����B���$y����/�&e�o�K��`Ej81�<�dA�R�2�ܨ#h����b1�����s�R��j��U��׮xv})>lD.	"A�N���^AZ������]���5�[����mڲ�`G�,��Iw��w�dDl�*��������M�nre�_�0�������}�)俚,�]B��G�������Gf� <��F�=i���}v�P�"�2����VƯt�֤ V�4��M;8�P���=�{z������a�=�B����A�H�{��@���*i�$b����X�k�$�B�*9��9/TE�u~U�%�[�!m��8��U����M�[t��1��<,����KM�nC{�����A�h�9.��RՏƃ��ej������"�e<��F�K���]rMß��0
'y[�+x�Ҋ ��u��X�������FY��x�[�]��6]n���8c��W�s���)Z_��A�A���d�~=��Zy̿{�� �x��7����,�&�@m��8U5fXF�$�~����1�dAa#X��,1\�Ӌ^ӆ��,�v9e�/��Lk��c1p��u
		netWorkLeve = data[31];
//		L.d("netWorkInfoCommandHandle===>>>> hasNetWork:"+hasNetWork+" netWorkLeve:"+netWorkLeve);
		return true;
	}
	
	/**
	 * 得到网络是否注册
	 * @return
	 */
	public static boolean getNetWorkStatus(){
		return hasNetWork ;
	}

	/**
	 * 得到网络信号强度
	 * @return
	 */
	public static int getNetWorkLevel(){
		return netWorkLeve;
	}

}
