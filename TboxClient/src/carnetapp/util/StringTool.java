�}�L  �   +x��֫z�u
��G֛��x(˦� x�J�֍&ѠV"�n�΃����,�)5O(�Xe˂X/�:+�Z�<���C+;l~���u�����i����U<;u�u���Ww̨��Q��a��/�9�	���EB�W��Wr�J�XRP�w�|+�3�N|��ݚ�}��w��\6$CA�i˜������&����w&jB��o{>�il��N`kn-'.�@F���	�%B1[���Pr/���y�\�g�<��������<D�X���cYɓE�U���4�^t#Yj \���W�dhP�'1����E����`�g�^�Ӿ~úw��C���5�V�x��E�o���0���o=`S|�õT�!��������"z!LA��`��+��?wp�c��RR�}s��褔}��DH��ގ��ƨĮ���s����t̲؍O����]��t7�z2ۈ��[��??�MJ�odS���'�q�	!8�ʋyZ��X�l�4��c��DK�ڶ��=?Y�i����?�n0�ג�
"�%gr<^��	�B�|uX�l֌�9Y�d����@��޹��qQ��{>����qn���d�ݢ^�pjZ�Sx���i���LDģdah�&f� ���sR��ƈ��
<V����u�f��������Z�"bm�g�E��f�'���J����r��/x`�O�������w�ՠ�V����� ��.�5fy�S=zi���1�@}R�$Z .Q��$ :n��+9�P�Uq��o0vہ��b�0�%}@q�~�#m �AW�8IMm��0ϪXOh�QϦ˭�	�>]F܈���Q'�虑{���G� ��M���-��g
<���5nҷ���s�C���f�Za�����{B��;�
*�e3�1A�W��������K�4��>K]�b��3ߌ���z�����ۘ?|�פ�fz�i�������Z�*�i�kS@��w�C)8��s
�o��ן�&�Xhl4G)�ugQ�{�\��7!�ϋ`~��6��F���"��V!�H"��������_��i��I�8n~3wGz	��	�	�&��T�7m��2��~<���o��i8}0�R�P?~��rX?< �S@�^�'�����YE�	Pm�Ci�`��f֭E���R�}B8��}��j�����ͩį�L������4%��=r�a���{<�&Y��f\`%N3�|���oYk/!�0L�cD��O�V�`�,���C��ws�5�?�;Z�sT��S��z���daS�K
t3����6�:(
�	t<�s
���td\D���O<�r2)��IG�B~q��sh��Y���.P�c�*wh����ocI־,�Y���A]�2��L��tX��~Nf��16)NQ~1�5xc�U�$0{����t$�=T̴o���ʥ:mgRբ]�Ǹ�`7�C<_ƖO�H�3,�1�\��jh�i�ρXlF�E��FY���g���`7/P�-�X�ZH�lD0Y�jk�r����S�њ*��sS�?/Ź�3{�M�m��3�1�{����=@����^����c�
�9�Q��ӂw��c����ΥT���_�pEpU������s^��*M\��=�f�cz��k]��|�𾁦�����{ɲ�J�D���zܘ����R�D
��������6���+V,�.�9J�7n(Χ�+ՠ1)Su2䘚es�'�}J��wr�1�Җ���Xq�xL�h\�R�.�
�W�!!�ni�]6Wwyh�<����@ΒΙ���Z�V�e��}�FrՋ�Ug�r��R3u��(m�a�ٸrs���=z�-L'i]��S���5�<�>LLzS�c8*�Pm��d]y�A����n;�'H@O���	6,b��U�����X��M�鐛���m�^��/�I]�qc��!m��P�/AZ�b=-!%GN��yr�`��LHd���CL�E�Ge�$�	�EO'�"��������6���U+			result[i] = tempValue;
		}
		return result;
	}

	public static int[] convertHexToDecimal() {
		return null;

	}

	/**
	 * 将16进制数字电话号转成字符电话号
	 * 
	 * @param phomunber
	 * @return
	 */
	public static String convertToPhomunberStr(int[] phomunber) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < phomunber.length; ++i) {
			builder.append(phomunber[i] + "");
		}
		return builder.toString();

	}

}
