�}}L  �    �����u
��� ֛Omx,���;?e�o�����oS�Y�z��A��K���0�*`�|��q�Z'A8z�us_���FP����e��w�m�a?�P�����HA�d������ߠ"<��$s��(��;"�y�W�ϾxG�qП#�����I|��Ļ��.T\�dG����)�ЄH�B�+^�^��2�Ԙ|�?���Ə5���$�t�����������k���q�q�w3:?2�'��b�ΉU��E�-w���b%a�U��ǒ�Q�KG���)��.�Hb1X��iP��Q��2.�Ԏ��lG�gJ16�Ҥ--��@vC�^���<U)�����0���o=`S|�õT�!��������"z!LA��`��+��?wp�c��RR�}s��褔}��DH��ގ��ƨĮ���s����t̲؍O����]��t7�z2ۈ��[��??�MJ�odS���'�q�	!8�ʋyZ��X�lD.�ǿ���D������4����4�������18<����6�$��Iƍ"�[�4Bb
�-Q)�]�|gjK{k�=1�2���v��D9ŀ�o[6���5��|���A?�l��)�Sy�r�j���
nɅa���~���C��D�9��)�F����;=ڔ"G���&`��^M���.0�ݸwt���?��ل�l��H<����i�n+�0��� ��NE��w���j�#�r�-	7t�f�����$�㑨��q7�9`H�vּ�עvK�V�l���z�P;8,>QHc�y� mgU�>愍q8��`0DK�t~�1Z�'�(�?%F���J�����u���o�ݘ4���t|�ANwJ�8k���YD�
��$+��FpO�R��L�b�nehλ�/ȲD�+e���o�u����� I\��P����XB ,���E�i��e
R�}�6�s��9-<*���3���9��v6��<b����̕��\��Al�m#1�c void onCreate() {

		super.onCreate();
		L.d("Application: onCreate");
		app = this;
		WhiteProvider.getInstance(getApplicationContext());
		startService(new Intent("carnetapp.tbox.main.TboxModel"));
	}

}
